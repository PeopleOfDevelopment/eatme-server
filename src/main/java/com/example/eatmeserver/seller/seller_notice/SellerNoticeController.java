package com.example.eatmeserver.seller.seller_notice;

import com.example.eatmeserver.admins.admin.model.AdminMainParam;
import com.example.eatmeserver.admins.admin.model.AdminNoticeFlex;
import com.example.eatmeserver.common.util.collection.ResMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sellerNotice")
public class SellerNoticeController {
    private final SellerNoticeService service;

    @PostMapping("/query")
    public ResMap getNoticeList(@RequestBody SellerNoticeParam param) {
        return new ResMap(service.getNoticeList(param));
    }

    @PostMapping("/detail")
    public ResMap getNoticeDetail(@RequestBody SellerNoticeParam param) {
        return new ResMap(service.getNoticeDetail(param));
    }

    @PostMapping("/insert")
    public int insertNotice(@RequestBody SellerNoticeFlex flex) {
        return service.insertNotice(flex);
    }

    @PostMapping("/update")
    public int updateNotice(@RequestBody SellerNoticeFlex flex) {
        return service.updateNotice(flex);
    }
}
