package com.example.eatmeserver.purchases.market_info;

import com.example.eatmeserver.common.util.collection.ResMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/marketInfo")
public class MarketInfoController {
    private final MarketInfoService service;

    @PostMapping("/query")
    public ResMap getMarketInfo(@RequestBody MarketInfoParam param) {
        return new ResMap(service.getMarketInfo(param));
    }

}
