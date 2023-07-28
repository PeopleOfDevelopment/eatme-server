package com.example.eatmeserver.security.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.annotation.PostConstruct;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Base64;
import java.util.Date;
import java.util.List;

@Component
public class JWTTokenProvider {

    public static String httpHeaderValue = "Authorization";
    private String secretKey = "eatme-dev";
    private long holdingTime = 60 * 60 * 60 * 1000L;

    private final UserDetailsService userService;


    public JWTTokenProvider(UserDetailsService userService){
        this.userService = userService;
    }

    @PostConstruct
    protected void encodeSecretKey() {
        secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
    }

    // JWT 토큰 생성
    public String makeToken(String userPk, List<String> roles) {
        Claims claims = Jwts.claims().setSubject(userPk); // JWT payload 에 저장되는 정보단위, 보통 여기서 user를 식별하는 값을 넣는다.
        claims.put("roles", roles); // 정보는 key / value 쌍으로 저장된다.
        Date now = new Date();
        return Jwts.builder()
                .setClaims(claims) //정보 저장
                .setIssuedAt(now) //토큰 발행 시간
                .setExpiration(new Date(now.getTime() + holdingTime)) //만료시간
                .signWith(SignatureAlgorithm.HS256, secretKey)  //사용할 암호화 알고리즘과 signature 에 들어갈 secret값 세팅
                .compact();
    }

    //JWT 토큰에서 인증 정보 조회
    public Authentication searchAuthority(String token) {
        UserDetails userDetails = userService.loadUserByUsername(this.checkUserInfo(token));
        return new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());
    }

    // 토큰의 유효성 + 만료일자 확인
    public boolean checkToken(String jwtToken) {
        try {
            Jws<Claims> claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(jwtToken);
            System.out.println(claims);
            return !claims.getBody().getExpiration().before(new Date());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //토큰에서 회원 정보 추출
    private String checkUserInfo(String token) {
        return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody().getSubject();
    }
}
