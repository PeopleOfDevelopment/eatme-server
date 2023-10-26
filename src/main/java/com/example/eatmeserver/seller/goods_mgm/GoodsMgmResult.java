package com.example.eatmeserver.seller.goods_mgm;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class GoodsMgmResult {
    private List<GoodsMgmFlex> sellingAll;
    private List<GoodsMgmFlex> sellingPick;
    private List<GoodsMgmFlex> sellingDeli;
}
