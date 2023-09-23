package com.example.eatmeserver.admins.admin.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AdminMainParam {
    // 조회할 데이터의 최대 양
    private Integer limitNum;

    // 공지사항 파라미터
    private String noticeNo;
    private LocalDate noticeTodt;
    private LocalDate noticeFrdt;
    private String noticeTp;

    // 고객문의
    private String qnaNo;
    private Boolean qnaSt;
    private String qnaTp;

    // 신고내역
    private String reportNo;
    private Boolean reportSt;

    // 정산



}
