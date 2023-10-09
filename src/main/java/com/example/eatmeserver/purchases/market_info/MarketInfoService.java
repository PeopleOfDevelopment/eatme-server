package com.example.eatmeserver.purchases.market_info;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarketInfoService {
    private final MarketInfoMapper mapper;

    /** 업장 정보 조회 */
    public MarketInfoFlex getMarketInfo(MarketInfoParam param) {
        return mapper.selectCorp(param);
    }
}
