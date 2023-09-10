package com.example.eatmeserver.seller.dashboard;

import com.example.eatmeserver.common.util.collection.ResMap;
import com.example.eatmeserver.seller.dashboard.model.DashboardParam;
import com.example.eatmeserver.seller.dashboard.model.DashboardQnaDetailFlex;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/dashboard")
public class DashboardController {
    private final DashboardService service;

    @PostMapping("/selling")
    public String getSelling(@RequestBody DashboardParam param) {
        return service.getSelling(param);
    }

    @PostMapping("/qnaList")
    public ResMap getQnaList(@RequestBody DashboardParam param) {
        return new ResMap(service.getQnaList(param));
    }

    @PostMapping("/qnaDetail")
    public ResMap getQnaDetail(@RequestBody DashboardParam param) {
        return new ResMap(service.getQnaDetail(param));
    }

    @PostMapping("/updateQnaAns")
    public int updateQnaAns(@RequestBody DashboardQnaDetailFlex flex) {
        return service.updateQnaAns(flex);
    }
}
