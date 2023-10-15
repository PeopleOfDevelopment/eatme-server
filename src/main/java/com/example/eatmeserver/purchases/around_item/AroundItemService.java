package com.example.eatmeserver.purchases.around_item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AroundItemService {
    private final AroundItemMapper mapper;

    public List<AroundItemFlex> getItem(AroundItemParam param) {
        return mapper.selectItem(param);
    }
}
