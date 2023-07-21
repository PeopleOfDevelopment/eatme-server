package com.example.eatmeserver.seller.seller_reg;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SellerRegMapper {

    int insertCorps(SellerRegParam param);
}
