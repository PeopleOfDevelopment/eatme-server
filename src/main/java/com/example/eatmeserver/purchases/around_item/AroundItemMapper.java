package com.example.eatmeserver.purchases.around_item;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AroundItemMapper {

    List<AroundItemFlex> selectItem(AroundItemParam param);

}
