package com.example.eatmeserver.seller.seller_profile;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SellerProfileService {
    private final SellerProfileMapper mapper;

    public SellerProfileFlex getSellerInfo(SellerProfileParam param) {
        return mapper.selectCorp(param);
    }

    public int updateSellerInfo(SellerProfileFlex flex) {
        return mapper.updateCorp(flex);
    }
}
