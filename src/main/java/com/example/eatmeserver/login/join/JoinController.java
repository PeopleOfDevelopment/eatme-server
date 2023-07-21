package com.example.eatmeserver.login.join;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/join")
public class JoinController {

    private final JoinService service;

    @PostMapping("/insert")
    public int join(@RequestBody JoinParam param) {
        int result = service.join(param);
        System.out.println(result);
        return result;
    }
}
