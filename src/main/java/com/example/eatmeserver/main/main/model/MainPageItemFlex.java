package com.example.eatmeserver.main.main.model;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class MainPageItemFlex {
    private String itemCd;
    private String itemNm;
    private String corpCd;
    private String corpNm;
    private Integer itemPrc;
    private Integer salePrc;
    private LocalDate itemExpdate;
}
