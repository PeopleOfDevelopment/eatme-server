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

    // 아이디 비밀번호 찾기 파라미터
    private String userEmail;
    private String userPhoneNumber;

    // 로그인 후 가맹점 조회시 사용하는 파라미터
    private String corpCd;
}
