package com.example.eatmeserver.admins.admin;

import com.example.eatmeserver.admins.admin.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    List<UserFlex> getUsers();

    /** 문의내역 조회 */
    List<AdminQnaFlex> selectQna(AdminMainParam param);

    /** 문의내역 상세조회 */
    AdminQnaFlex selectQnaDetail(AdminMainParam param);

    /** 문의내역 답변 작성 */
    int updateQna(AdminQnaFlex flex);

    /** 신고내역 조회  */
    List<AdminReportFlex> selectReport(AdminMainParam param);

    /** 신고내역 상세조회 */
    AdminReportFlex selectReportDetail(AdminMainParam param);

    /** 공지사항 조회 */
    List<AdminNoticeFlex> selectNotice(AdminMainParam param);

    /** 공지사항 상세조회 */
    AdminNoticeFlex selectNoticeDetail(AdminMainParam param);

    /** 공지사항 작성 */
    int insertNotice(AdminNoticeFlex flex);

    /** 공지사항 수정 */
    int updateNotice(AdminNoticeFlex flex);
}
