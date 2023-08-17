package com.example.eatmeserver.seller.item_reg;

import com.example.eatmeserver.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ItemRegFlex extends BaseModel {
    private String itemCd;
    private String corpCd;
    private String itemNm;
    private String itemBarcode;
    private Integer itemPrc;
    private Boolean useYn;
}
