package com.example.eatmeserver.purchases.around_market;

import com.example.eatmeserver.common.util.collection.ResMap;
import com.example.eatmeserver.purchases.around_item.AroundItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/aroundMarket")
public class AroundMarketController {
    private final AroundMarketService service;

    public ResMap getCorp(@RequestBody AroundMarketParam param) {
        return new ResMap(service.getCorp(param));
    }
}
