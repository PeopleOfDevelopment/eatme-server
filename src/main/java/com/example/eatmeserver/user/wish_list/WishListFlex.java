package com.example.eatmeserver.user.wish_list;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class WishListFlex {
    private String userId;
    private String itemCd;
    private String itemNm;
    private Integer itemQty;
    private String corpCd;
    private String corpNm;
}
