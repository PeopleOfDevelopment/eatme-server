package com.example.eatmeserver.purchases.purchase;

import com.example.eatmeserver.purchases.purchase.model.PurchaseHistoryDParam;
import com.example.eatmeserver.purchases.purchase.model.PurchaseHistoryFlex;
import com.example.eatmeserver.purchases.purchase.model.PurchaseHistoryParam;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PurchaseHistoryService {

    private final PurchaseHistoryMapper mapper;

    public List<PurchaseHistoryFlex> getPurchaseHistory(PurchaseHistoryParam param) {
        return mapper.selectPurchaseHistory(param);
    }

    public PurchaseHistoryFlex getPurchaseHistoryD(PurchaseHistoryDParam param) {
        return mapper.selectPurchaseHistoryD(param);
    }

}
