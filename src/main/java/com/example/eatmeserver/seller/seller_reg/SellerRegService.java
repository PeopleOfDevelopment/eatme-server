package com.example.eatmeserver.seller.seller_reg;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SellerRegService {
    private final SellerRegMapper mapper;

    public int insert(SellerRegParam param) {
        return mapper.insertCorps(param);
    }
}
