package com.example.eatmeserver.seller.seller_notice;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class SellerNoticeFlex {
    private String noticeNo;
    private String noticeTit;
    private String noticeTxt;
    private LocalDate noticeTodt;
    private LocalDate noticeFrdt;
    private String noticeTp;
    private String corpCd;
}
