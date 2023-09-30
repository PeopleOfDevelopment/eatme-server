package com.example.eatmeserver.seller.goods_reg;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsRegMapper {
    /** 상품등록 */
    int insertGoods(GoodsRegFlex flex);

    /** 상품수정 */
    int updateGoods(GoodsRegFlex flex);

    /** 상품삭제 */
    int deleteGoods(GoodsRegFlex flex);

    /** 상품조회 */
    List<GoodsRegFlex> selectGoods(GoodsRegParam param);
}
