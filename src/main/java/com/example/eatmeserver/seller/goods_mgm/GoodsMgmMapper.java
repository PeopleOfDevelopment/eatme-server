package com.example.eatmeserver.seller.goods_mgm;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMgmMapper {
    List<GoodsMgmFlex> selectSelling(GoodsMgmParam param);
}
