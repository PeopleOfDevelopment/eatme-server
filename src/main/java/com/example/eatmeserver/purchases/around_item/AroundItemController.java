package com.example.eatmeserver.purchases.around_item;

import com.example.eatmeserver.common.util.collection.ResMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/aroundItem")
public class AroundItemController {
    private final AroundItemService service;

    @PostMapping("/query")
    public ResMap getItem(@RequestBody AroundItemParam param) {
        return new ResMap(service.getItem(param));
    }
}
