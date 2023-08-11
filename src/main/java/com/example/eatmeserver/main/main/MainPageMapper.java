package com.example.eatmeserver.main.main;

import com.example.eatmeserver.main.main.model.MainPageCorpFlex;
import com.example.eatmeserver.main.main.model.MainPageItemFlex;
import com.example.eatmeserver.main.main.model.MainPageParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainPageMapper {
    List<MainPageCorpFlex> selectCorp5(MainPageParam param);

    List<MainPageItemFlex> selectItem5(MainPageParam param);
}
