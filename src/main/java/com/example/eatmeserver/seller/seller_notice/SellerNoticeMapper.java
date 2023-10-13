package com.example.eatmeserver.seller.seller_notice;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SellerNoticeMapper {
    /** 공지사항 조회 */
    List<SellerNoticeFlex> selectNotice(SellerNoticeParam param);

    /** 공지사항 상세조회 */
    SellerNoticeFlex selectNoticeDetail(SellerNoticeParam param);

    /** 공지사항 작성 */
    int insertNotice(SellerNoticeFlex flex);

    /** 공지사항 수정 */
    int updateNotice(SellerNoticeFlex flex);
}
