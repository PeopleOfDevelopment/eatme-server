package com.example.eatmeserver.purchases.purchase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PurchaseHistoryService {

    private final PurchaseHistoryMapper mapper;

    public List<PurchaseHistoryFlex> getPurchaseHistory(PurchaseHistoryParam param) {
        return mapper.getPurchaseHistory(param);
    }

}
