package com.example.eatmeserver.seller.seller_profile;

import com.example.eatmeserver.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SellerProfileFlex extends BaseModel {
    private String corpCd;
    private String userId;
    private String corpAddr;
    private String corpRegNo;
    private String corpDesc;
    private Boolean userYn;
    private String corpNm;
}
