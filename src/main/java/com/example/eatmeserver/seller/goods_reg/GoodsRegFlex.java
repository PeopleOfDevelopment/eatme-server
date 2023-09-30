package com.example.eatmeserver.seller.goods_reg;

import com.example.eatmeserver.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class GoodsRegFlex extends BaseModel {
    private String itemCd;
    private String corpCd;
    private Double discountRat;
    private String itemBarcode;
    private Integer salePrc;
    private Integer saleAmt;
    private LocalDate itemExpdate;
    private String itemNm;
}
