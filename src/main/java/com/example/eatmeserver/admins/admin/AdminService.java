package com.example.eatmeserver.admins.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminMapper mapper;
    public List<UserFlex> getUserList() {
        return mapper.getUsers();
    }
}
