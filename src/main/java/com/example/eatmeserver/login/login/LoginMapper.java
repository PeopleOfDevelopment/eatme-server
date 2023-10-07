package com.example.eatmeserver.login.login;

import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface LoginMapper {
    Optional<LoginParam> getUser(LoginParam param);

}
