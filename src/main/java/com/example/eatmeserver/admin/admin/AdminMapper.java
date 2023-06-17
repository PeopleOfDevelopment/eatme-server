package com.example.eatmeserver.admin.admin;

import com.example.eatmeserver.admin.admin.UserFlex;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    List<UserFlex> getUsers();
}
