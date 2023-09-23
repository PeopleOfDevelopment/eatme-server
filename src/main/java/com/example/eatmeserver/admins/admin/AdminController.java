package com.example.eatmeserver.admins.admin;

import com.example.eatmeserver.admins.admin.model.AdminMainParam;
import com.example.eatmeserver.admins.admin.model.AdminNoticeFlex;
import com.example.eatmeserver.admins.admin.model.AdminQnaFlex;
import com.example.eatmeserver.common.util.collection.ResMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin")
public class AdminController {

    private final AdminService service;

    @PostMapping("/qna/query")
    public ResMap getQnaList(@RequestBody AdminMainParam param) {
        return new ResMap(service.getQnaList(param));
    }
    @PostMapping("/qna/detail")
    public ResMap getQnaDetail(@RequestBody AdminMainParam param) {
        return new ResMap(service.getQnaDetail(param));
    }
    @PostMapping("/qna/update")
    public int writeAns(@RequestBody AdminQnaFlex flex) {
        return service.writeQnaAns(flex);
    }


    @PostMapping("/report/query")
    public ResMap getReportList(@RequestBody AdminMainParam param) {
        return new ResMap(service.getReportList(param));
    }
    @PostMapping("/report/detail")
    public ResMap getReportDetail(@RequestBody AdminMainParam param) {
        return new ResMap(service.getReportDetail(param));
    }


    @PostMapping("/notice/query")
    public ResMap getNoticeList(@RequestBody AdminMainParam param) {
        return new ResMap(service.getNoticeList(param));
    }
    @PostMapping("/notice/detail")
    public ResMap getNoticeDetail(@RequestBody AdminMainParam param) {
        return new ResMap(service.getNoticeDetail(param));
    }
    @PostMapping("notice/insert")
    public int insertNotice(@RequestBody AdminNoticeFlex flex) {
        return service.insertNotice(flex);
    }
    @PostMapping("notice/update")
    public int updateNotice(@RequestBody AdminNoticeFlex flex) {
        return service.updateNotice(flex);
    }

}
