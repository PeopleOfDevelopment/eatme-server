package com.example.eatmeserver.seller.dashboard.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class DashboardParam {

    private String userId;
    private String corpCd;

    private LocalDate frDt;
    private LocalDate toDt;
}
