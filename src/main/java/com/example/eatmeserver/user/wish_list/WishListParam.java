package com.example.eatmeserver.user.wish_list;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class WishListParam {
    private String userId;
    private String itemCd;
    private String corpCd;
    private Integer itemQty;

}
