package com.example.eatmeserver.admins.admin;

import com.example.eatmeserver.util.collection.ResMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/userlist")
public class AdminController {

    private final AdminService service;

    @PostMapping("/query")
    public ResMap getUserList() {
        return new ResMap(service.getUserList());
    }
}
