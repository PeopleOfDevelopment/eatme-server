package com.example.eatmeserver.purchases.around_market;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AroundMarketMapper {

    List<AroundMarketFlex> selectCorp(AroundMarketParam param);

}
