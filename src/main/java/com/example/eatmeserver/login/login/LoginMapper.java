package com.example.eatmeserver.login.login;

import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface LoginMapper {
    Optional<LoginParam> getUser(LoginParam param);

    LoginParam findId(LoginParam param);

    Integer findPw(LoginParam param);

    Integer resetPw(LoginParam param);

    LoginParam selectCorp(LoginParam param);
}
