package com.example.eatmeserver.purchases.purchase.model;

import com.example.eatmeserver.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PurchaseHistoryFlex extends BaseModel {
    private String itemCd;
    private String corpCd;
    private String itemNm;
    private Integer itemQty;
    private Integer salePrc;
    private Double discountRat;
    private Boolean pickYn;
    private String sellingSt;

}
