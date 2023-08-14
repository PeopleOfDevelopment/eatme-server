package com.example.eatmeserver.purchases.purchase;

import com.example.eatmeserver.common.util.collection.ResMap;
import com.example.eatmeserver.purchases.purchase.model.PurchaseHistoryDParam;
import com.example.eatmeserver.purchases.purchase.model.PurchaseHistoryParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/purchaseHistory")
public class PurchaseHistoryController {
    private final PurchaseHistoryService service;

    /** 구매내역 조회 */
    @PostMapping("/query")
    public ResMap getPurchaseHistory(@RequestBody PurchaseHistoryParam param) {
        return new ResMap(service.getPurchaseHistory(param));
    }

    /** 구매내역 상세조회 */
    @PostMapping("/query/detail")
    public ResMap getPurchaseHistoryD(@RequestBody PurchaseHistoryDParam param) {
        return new ResMap(service.getPurchaseHistoryD(param));
    }
}
