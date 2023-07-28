package com.example.eatmeserver.security.jwt;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class JWTTokenFilter extends OncePerRequestFilter {
    private JWTTokenProvider provider;

    public JWTTokenFilter(JWTTokenProvider provider) {
        this.provider = provider;
    }

    @Override
    protected void doFilterInternal(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response, jakarta.servlet.FilterChain filterChain) throws jakarta.servlet.ServletException, IOException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String token = httpRequest.getHeader(provider.httpHeaderValue);
        //유효한 토큰인지 확인합니다.
        if (token != null && provider.checkToken(token)) {
            // 토큰이 유효하면 토큰으로부터 유저 정보를 받아옵니다.
            Authentication authentication = provider.searchAuthority(token);
            //SecurityContext 에 Authentication 객체를 저장합니다.
            SecurityContextHolder.getContext().setAuthentication(authentication);
            System.out.println(authentication);
        }
        filterChain.doFilter(request, response);
    }


}
