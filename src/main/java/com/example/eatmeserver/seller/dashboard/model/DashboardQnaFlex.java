package com.example.eatmeserver.seller.dashboard.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class DashboardQnaFlex {
    private String qnaNo;
    private String userId;
    private String qnaTit;
    private LocalDate insertDatetime;
}
