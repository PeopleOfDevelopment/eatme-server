package com.example.eatmeserver.user.wish_list;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WishListMapper {

    List<WishListFlex> selectWish(WishListParam param);


    int insertWish(WishListParam param);

    int deleteWish(WishListParam param);

}
