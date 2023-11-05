package com.example.eatmeserver.user.eco_status;

import com.example.eatmeserver.common.util.collection.ResMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ecoStatus")
public class EcoStatusController {
    private final EcoStatusService service;

    @PostMapping("/query")
    public ResMap getStatus(@RequestBody EcoStatusParam param) {
        return new ResMap(service.getStatus(param));
    }

}
