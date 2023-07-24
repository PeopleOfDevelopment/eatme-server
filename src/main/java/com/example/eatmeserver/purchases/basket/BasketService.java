package com.example.eatmeserver.purchases.basket;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BasketService {

    private final BasketMapper mapper;

    /** 장바구니 내역 조회 */
    public List<BasketFlex> getBasketList(BasketParam param){
        return mapper.selectBasket(param);
    }

    /** 장바구니 삽입 */
    @Transactional
    public int insertBasketList(List<BasketFlex> flex) {
        int resultCnt = 0;
        for (int i = 0; i < flex.size(); i++) {
            mapper.insertBasket(flex.get(i));
            resultCnt++;
        }
        return resultCnt;
    }
}
