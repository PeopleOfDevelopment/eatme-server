package com.example.eatmeserver.login.login;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    private final SqlSession sqlSession;

    public LoginService(SqlSession ss) {
        this.sqlSession = ss;
    }

    public Optional<LoginParam> login(LoginParam param) {
        LoginMapper mapper = sqlSession.getMapper(LoginMapper.class);
        return mapper.getUser(param);
    }
}
