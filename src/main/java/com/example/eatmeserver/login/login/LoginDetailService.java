package com.example.eatmeserver.login.login;

import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class LoginDetailService implements UserDetailsService {
    private final LoginService service;

    public LoginDetailService(LoginService ls) {
        this.service = ls;
    }

    @Override
    public UserDetails loadUserByUsername(String userId) {
        LoginParam param = LoginParam
                .loginBuilder()
                .userId(userId)
                .build();

        // 사용자 정보가 존재하지 않는 경우
        if (userId == null || userId.equals("")) {
            return service.login(param)
                    .map(u -> new LoginDetailParam(u, Collections.singleton(new SimpleGrantedAuthority(u.getUserId()))))
                    .orElseThrow(() -> new AuthenticationServiceException(userId));
        }
        // 비밀번호가 맞지 않는 경우
        else {
            return service.login(param)
                    .map(u -> new LoginDetailParam(u, Collections.singleton(new SimpleGrantedAuthority(u.getUserId()))))
                    .orElseThrow(() -> new BadCredentialsException(userId));
        }
    }
}
