package com.example.eatmeserver.seller.dashboard.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class DashboardParam {

    // 매출, QnA, 픽업 및 매출 조회 parameter
    private String userId;
    private String corpCd;
    private LocalDate frDt;
    private LocalDate toDt;

    // QnA 상세조회 parameter
    private String qnaNo;
}
