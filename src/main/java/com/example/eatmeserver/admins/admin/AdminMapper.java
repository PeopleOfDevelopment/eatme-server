package com.example.eatmeserver.admins.admin;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    List<UserFlex> getUsers();

}
