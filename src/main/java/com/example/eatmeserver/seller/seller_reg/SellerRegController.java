package com.example.eatmeserver.seller.seller_reg;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sellerReg")
public class SellerRegController {
    private final SellerRegService service;

    @PostMapping("/insert")
    public int insert(@RequestBody SellerRegParam param) {
        return service.insert(param);
    }
}
