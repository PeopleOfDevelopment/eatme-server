package com.example.eatmeserver.user.eco_status;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EcoStatusMapper {
    List<EcoStatusFlex> selectEco();

}
