package com.example.eatmeserver.seller.goods_mgm;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class GoodsMgmFlex {
    private String itemCd;
    private String corpCd;
    private Double discountRat;
    private String itemBarcode;
    private Integer salePrc;
    private Integer saleAmt;
    private LocalDate itemExpdate;
    private String itemNm;
    private Boolean pickYn;

}
