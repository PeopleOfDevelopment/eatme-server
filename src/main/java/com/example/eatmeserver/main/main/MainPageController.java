package com.example.eatmeserver.main.main;

import com.example.eatmeserver.common.util.collection.ResMap;
import com.example.eatmeserver.main.main.model.MainPageParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/main")
public class MainPageController {

    private final MainPageService service;

    @PostMapping("/query/corp")
    public ResMap getCorp5(@RequestBody MainPageParam param) {
        return new ResMap(service.getCorp5(param));
    }

    @PostMapping("/query/item")
    public ResMap getItem5(@RequestBody MainPageParam param) {
        return new ResMap(service.getItem5(param));
    }

}
