package com.example.eatmeserver.user.eco_status;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EcoStatusResult {
    private Integer saveTree;
    private Integer allSaleAmt;
    private Integer allSalePrc;


    public EcoStatusResult(int saveTree, int allSaleAmt, int allSalePrc) {
        this.saveTree = saveTree;
        this.allSaleAmt = allSaleAmt;
        this.allSalePrc = allSalePrc;
    }
}
