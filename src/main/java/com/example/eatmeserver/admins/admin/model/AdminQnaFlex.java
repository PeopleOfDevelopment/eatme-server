package com.example.eatmeserver.admins.admin.model;

import com.example.eatmeserver.common.model.BaseModel;
import lombok.Data;

@Data
public class AdminQnaFlex extends BaseModel {
    private String qnaNo;
    private String userId;
    private String qnaTit;
    private String qnaTxt;
    private String qnaAns;
    private String qnaSt;
}
