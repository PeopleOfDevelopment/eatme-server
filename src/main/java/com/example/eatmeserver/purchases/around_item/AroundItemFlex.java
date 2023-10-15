package com.example.eatmeserver.purchases.around_item;

import com.example.eatmeserver.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class AroundItemFlex extends BaseModel {
    private String itemCd;
    private LocalDate itemExpdate;
    private Double discountRat;
    private Integer salePrc;
    private Integer saleAmt;
}
