package com.example.eatmeserver.admins.admin;

import com.example.eatmeserver.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserFlex extends BaseModel {

    private String userId;
    private String userPw;
    private String userNm;
    private String userNick;
    private String userEmail;
    private String userAddr;
    private String useYn;

}
