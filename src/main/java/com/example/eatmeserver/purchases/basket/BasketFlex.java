package com.example.eatmeserver.purchases.basket;

import com.example.eatmeserver.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class BasketFlex extends BaseModel {
    private String corpCd;
    private String corpNm;
    private String userId;
    private String itemNm;
    private Integer salePrc;
    private Integer itemPrc;
    private Double discountRat;
    private LocalDate itemExpdate;
    private String purchaseSt;
    private String itemCd;
    private Integer itemQty;
    private String basketNo;
}
