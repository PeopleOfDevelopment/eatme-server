package com.example.eatmeserver.seller.seller_profile;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SellerProfileMapper {
    SellerProfileFlex selectCorp(SellerProfileParam param);

    int updateCorp(SellerProfileFlex flex);
}
