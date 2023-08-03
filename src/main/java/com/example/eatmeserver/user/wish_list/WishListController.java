package com.example.eatmeserver.user.wish_list;

import com.example.eatmeserver.common.util.collection.ResMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/wishList")
public class WishListController {

    private final WishListService service;

    /** 찜목록 조회 */
    @PostMapping("/query")
    private ResMap getWishList(@RequestBody WishListParam param) {
        return new ResMap(service.getWishList(param));
    }
}
