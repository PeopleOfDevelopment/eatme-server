package com.example.eatmeserver.purchases.basket;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BasketMapper {

    /** 장바구니 내역 조회 */
    List<BasketFlex> selectBasket(BasketParam param);

    /** 장바구니 삽입 */
    int insertBasket(BasketFlex flex);

    /** 장바구니 삭제 */
    int deleteBasket(BasketFlex flex);

    /** 장바구니 수정 */
    int updateBasket(BasketFlex flex);
}
