package com.example.eatmeserver.login.login;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindService {
    private final LoginMapper mapper;

    public LoginParam findId(LoginParam param) {
        return mapper.findId(param);
    }

    public Boolean findPw(LoginParam param) {
        if(mapper.findPw(param) == 1) {
            return true;
        }else return false;
    }

    public int resetPw(LoginParam param) {
        return mapper.resetPw(param);
    }
}
