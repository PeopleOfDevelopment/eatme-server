package com.example.eatmeserver.seller.item_reg;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemRegMapper {

    /** 품목 등록 */
    int insertItem(ItemRegFlex flex);

    /** 등록된 품목 조회 */
    List<ItemRegFlex> selectItem(ItemRegParam param);

    /** 등록된 품목 수정 */
    int updateItem(ItemRegFlex flex);

    /** 등록된 품목 삭제 */
    int deleteItem(ItemRegParam param);
}
