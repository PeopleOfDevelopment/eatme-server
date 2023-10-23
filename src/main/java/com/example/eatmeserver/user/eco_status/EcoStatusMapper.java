package com.example.eatmeserver.user.eco_status;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EcoStatusMapper {
    EcoStatusFlex selectEco();
}
