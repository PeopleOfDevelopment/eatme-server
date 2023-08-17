package com.example.eatmeserver.seller.item_reg;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemRegService {

    private final ItemRegMapper mapper;
    
    /** 품목 리스트를 하나씩 등록해주는 메서드 */
    public int insertItems(List<ItemRegFlex> flex) {
        int result = 0;
        for (int i = 0; i < flex.size(); i++) {
            mapper.insertItem(flex.get(i));
        }
        return result;
    }

    /** 품목 리스트 조회 */
    public List<ItemRegFlex> getItems(ItemRegParam param) {
        return mapper.selectItem(param);
    }
}
