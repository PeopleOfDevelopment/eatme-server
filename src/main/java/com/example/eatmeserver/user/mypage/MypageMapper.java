package com.example.eatmeserver.user.mypage;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MypageMapper {

    /** 유저정보 조회 */
    MypageFlex selectUser(MypageParam param);

    /** 유저정보 변경 */
    int updateUser(MypageFlex flex);

    /** 회원 탈퇴 */
    int deleteUser(MypageFlex flex);
}
