package com.example.eatmeserver.purchases.basket;

import com.example.eatmeserver.util.collection.ResMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/basket")
public class BasketController {

    private final BasketService service;

    /** 장바구니 목록 조회 */
    @PostMapping("/query")
    public ResMap getBasketList(@RequestBody BasketParam param) {
        return new ResMap(service.getBasketList(param));
    }

    /** 장바구니 삽입 */
    @PostMapping("/insert")
    public int insertBasketList(@RequestBody List<BasketFlex> flex) {
        return service.insertBasketList(flex);
    }

    /** 장바구니 삭제 */
    @PostMapping("/delete")
    public int deleteBasket(@RequestBody BasketFlex flex) {
        return service.deleteBasket(flex);
    }

    /** 장바구니 수정 */
    @PostMapping("/update")
    public int updateBasket(@RequestBody BasketFlex flex) {
        return service.updateBasket(flex);
    }
}
