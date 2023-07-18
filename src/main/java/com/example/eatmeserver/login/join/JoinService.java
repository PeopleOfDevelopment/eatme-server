package com.example.eatmeserver.login.join;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final JoinMapper mapper;

    /** 회원가입 */
    public void join(JoinParam param) {
        // TODO 회원가입시 아이디, 비밀번호 암복호화 작업 필요
        mapper.insert(param);
    }

}
