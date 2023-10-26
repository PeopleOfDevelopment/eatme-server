package com.example.eatmeserver.seller.goods_mgm;

import com.example.eatmeserver.common.util.collection.ResMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/goodsMgm")
public class GoodsMgmController {

    private final GoodsMgmService service;

    @PostMapping("/query")
    public ResMap getSelling(@RequestBody GoodsMgmParam param) {
        return new ResMap(service.getSelling(param));
    }

}
