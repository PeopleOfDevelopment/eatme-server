package com.example.eatmeserver.seller.seller_reg;


import com.example.eatmeserver.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SellerRegParam extends BaseModel {
    private String corpCd;
    private String corpNm;
    private String userId;
    private String corpRegNo;
    private String corpAddr;
    private String corpDesc;
    private Boolean useYn;
}
