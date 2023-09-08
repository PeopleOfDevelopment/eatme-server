package com.example.eatmeserver.seller.dashboard;

import com.example.eatmeserver.seller.dashboard.model.DashboardParam;
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
    public int getSelling(@RequestBody DashboardParam param) {
        return service.getSelling(param);
    }
}
