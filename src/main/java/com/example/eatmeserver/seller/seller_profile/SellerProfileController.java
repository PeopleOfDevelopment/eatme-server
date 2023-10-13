package com.example.eatmeserver.seller.seller_profile;

import com.example.eatmeserver.common.util.collection.ResMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping({"/api/sellerProfile"})
public class SellerProfileController {
    private final SellerProfileService service;

    @PostMapping("/query")
    public ResMap getSellerInfo(@RequestBody SellerProfileParam param) {
        return new ResMap(service.getSellerInfo(param));
    }

    @PostMapping("/update")
    public int updateSellerInfo(@RequestBody SellerProfileFlex flex) {
        return service.updateSellerInfo(flex);
    }
}
