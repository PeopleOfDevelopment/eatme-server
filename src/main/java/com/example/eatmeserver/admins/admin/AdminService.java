package com.example.eatmeserver.admins.admin;

import com.example.eatmeserver.admins.admin.model.AdminMainParam;
import com.example.eatmeserver.admins.admin.model.AdminNoticeFlex;
import com.example.eatmeserver.admins.admin.model.AdminQnaFlex;
import com.example.eatmeserver.admins.admin.model.AdminReportFlex;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminMapper mapper;

    public List<AdminQnaFlex> getQnaList(AdminMainParam param) {
        return mapper.selectQna(param);
    }
    public AdminQnaFlex getQnaDetail(AdminMainParam param) {
        return mapper.selectQnaDetail(param);
    }
    public int writeQnaAns(AdminQnaFlex flex) {
        return mapper.updateQna(flex);
    }


    public List<AdminReportFlex> getReportList(AdminMainParam param) {
        return mapper.selectReport(param);
    }
    public AdminReportFlex getReportDetail(AdminMainParam param) {
        return mapper.selectReportDetail(param);
    }


    public List<AdminNoticeFlex> getNoticeList(AdminMainParam param) {
        return mapper.selectNotice(param);
    }
    public AdminNoticeFlex getNoticeDetail(AdminMainParam param) {
        return mapper.selectNoticeDetail(param);
    }
    public int insertNotice(AdminNoticeFlex flex) {
        return mapper.insertNotice(flex);
    }
    public int updateNotice(AdminNoticeFlex flex) {
        return mapper.updateNotice(flex);
    }
}
