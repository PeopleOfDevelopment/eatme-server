package com.example.eatmeserver.seller.seller_notice;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class SellerNoticeParam {
    // 공지사항 파라미터
    private String noticeNo;
    private LocalDate noticeTodt;
    private LocalDate noticeFrdt;
    private String noticeTp;
    private String corpCd;
}
