package com.example.eatmeserver.login.join;

import com.example.eatmeserver.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class JoinParam extends BaseModel {
    private String userNm;
    private String userId;
    private String userPw;
    private String userEmail;
    private String userNick;
    private String userAddr;
    private String userPhoneNumber;
    private Boolean useYn;
}
