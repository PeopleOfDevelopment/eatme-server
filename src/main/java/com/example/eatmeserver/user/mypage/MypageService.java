package com.example.eatmeserver.user.mypage;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MypageService {
    private final MypageMapper mapper;

    public MypageFlex getUserInfo(MypageParam param) {
        return mapper.selectUser(param);
    }

    @Transactional
    public int updateUserInfo(MypageFlex flex) {
        return mapper.updateUser(flex);
    }

    @Transactional
    public int exitUser(MypageFlex flex) {
        return mapper.deleteUser(flex);
    }
}
