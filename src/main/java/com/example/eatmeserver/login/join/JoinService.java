package com.example.eatmeserver.login.join;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final JoinMapper mapper;

    /** 회원가입 */
    @Transactional
    public int join(JoinParam param) {
        // TODO 회원가입시 아이디, 비밀번호 암복호화 작업 필요
        return mapper.insert(param);
    }

    public boolean checkOverlap(JoinParam param) {
        int result = mapper.select(param);

        if(result == 0) return true;
        else return false;
    }

}
