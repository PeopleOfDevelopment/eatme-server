package com.example.eatmeserver.purchases.market_info;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MarketInfoMapper {
    MarketInfoFlex selectCorp(MarketInfoParam param);
}
