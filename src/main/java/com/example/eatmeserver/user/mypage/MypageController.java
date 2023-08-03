package com.example.eatmeserver.user.mypage;

import com.example.eatmeserver.common.util.collection.ResMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/mypage")
public class MypageController {
    private final MypageService service;

    /** 유저정보 조회 */
    @PostMapping("/query")
    public ResMap getUserInfo(@RequestBody MypageParam param) {
        return new ResMap(service.getUserInfo(param));
    }

    /** 유저 정보 변경 */
    @PostMapping("/changeUser")
    public int changeUserInfo(@RequestBody MypageFlex flex) {
        return service.updateUserInfo(flex);
    }

    /** 회원 탈퇴 */
    @PostMapping("/exit")
    public int exitUser(@RequestBody MypageFlex flex) {
        return service.exitUser(flex);
    }
}
