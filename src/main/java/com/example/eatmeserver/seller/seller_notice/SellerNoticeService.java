package com.example.eatmeserver.seller.seller_notice;

import com.example.eatmeserver.admins.admin.model.AdminMainParam;
import com.example.eatmeserver.admins.admin.model.AdminNoticeFlex;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SellerNoticeService {
    private final SellerNoticeMapper mapper;

    public List<SellerNoticeFlex> getNoticeList(SellerNoticeParam param) {
        return mapper.selectNotice(param);
    }

    public SellerNoticeFlex getNoticeDetail(SellerNoticeParam param) {
        return mapper.selectNoticeDetail(param);
    }

    public int insertNotice(SellerNoticeFlex flex) {
        return mapper.insertNotice(flex);
    }

    public int updateNotice(SellerNoticeFlex flex) {
        return mapper.updateNotice(flex);
    }

}
