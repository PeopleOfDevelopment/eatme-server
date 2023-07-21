package com.example.eatmeserver.login.join;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JoinMapper {

    int insert(JoinParam param);

}
