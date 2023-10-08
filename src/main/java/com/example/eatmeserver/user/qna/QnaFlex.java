package com.example.eatmeserver.user.qna;

import com.example.eatmeserver.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class QnaFlex extends BaseModel {
    private String qnaNo;
    private String userId;
    private String qnaTit;
    private String qnaTxt;
    private String qnaTp;
    private String qnaSt;
    private String corpCd;
}
