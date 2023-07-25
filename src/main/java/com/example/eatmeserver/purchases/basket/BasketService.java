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

    /** 장바구니 삭제 */
    @Transactional
    public int deleteBasket(BasketFlex flex) {
        return mapper.deleteBasket(flex);
    }

    /** 장바구니 수정(수량변경 등등..) */
    @Transactional
    public int updateBasket(BasketFlex flex) {
        return mapper.updateBasket(flex);
    }
}
