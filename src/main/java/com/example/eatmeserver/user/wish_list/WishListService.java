package com.example.eatmeserver.user.wish_list;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WishListService {

    private final WishListMapper mapper;

    public List<WishListFlex> getWishList(WishListParam param) {
        return mapper.selectWish(param);
    }


    public int insertWish(WishListParam param) {
        return mapper.insertWish(param);
    }

    public int deleteWish(WishListParam param) {
        return mapper.deleteWish(param);
    }
}
