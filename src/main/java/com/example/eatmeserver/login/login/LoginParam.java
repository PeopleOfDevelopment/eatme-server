package com.example.eatmeserver.login.login;

import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LoginParam {

    private String userId;
    private String userPw;
    private String userNm;

    private Integer userSq;

    @Builder(builderMethodName = "loginBuilder", toBuilder = true)
    private LoginParam(int userSq, String userId, String userPw, String userNm) {
        this.userSq = userSq;
        this.userId = userId;
        this.userPw = userPw;
        this.userNm = userNm;
    }
}
