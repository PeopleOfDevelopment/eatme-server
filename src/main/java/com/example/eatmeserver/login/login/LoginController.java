package com.example.eatmeserver.login.login;

import com.example.eatmeserver.common.response.ApiResponse;
import com.example.eatmeserver.common.util.code.SuccessCode;
import com.example.eatmeserver.common.util.login_utils.TokenUtils;
import com.example.eatmeserver.security.AuthConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/login")
public class LoginController {
    /**
     * [API] 사용자 정보를 기반으로 JWT를 발급하는 API
     *
     * @param param LoginParam
     * @return ApiResponseWrapper<ApiResponse> : 응답 결과 및 응답 코드 반환
     */
    @PostMapping("/generateToken")
    public ResponseEntity<ApiResponse> selectCodeList(@RequestBody LoginParam param) {

        String resultToken = TokenUtils.generateJwtToken(param);

        ApiResponse ar = ApiResponse.builder()
                // BEARER {토큰} 형태로 반환을 해줍니다.
                .result(AuthConstants.TOKEN_TYPE + " " + resultToken)
                .resultCode(SuccessCode.SELECT.getStatus())
                .resultMsg(SuccessCode.SELECT.getMessage())
                .build();

        return new ResponseEntity<>(ar, HttpStatus.OK);
    }
}
