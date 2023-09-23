package com.example.eatmeserver.admins.admin.model;

import com.example.eatmeserver.common.model.BaseModel;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AdminNoticeFlex extends BaseModel {
    private String noticeNo;
    private String noticeTit;
    private String noticeTxt;
    private LocalDate noticeTodt;
    private LocalDate noticeFrdt;
    private String noticeTp;
}
