package com.example.eatmeserver.purchases.around_market;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AroundMarketService {
    private final AroundMarketMapper mapper;

    public List<AroundMarketFlex> getCorp(AroundMarketParam param) {
        return mapper.selectCorp(param);
    }

}
