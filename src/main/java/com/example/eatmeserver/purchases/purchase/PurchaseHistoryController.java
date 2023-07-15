package com.example.eatmeserver.purchases.purchase;

import com.example.eatmeserver.util.collection.ResMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/purchaseHistory")
public class PurchaseHistoryController {
    private final PurchaseHistoryService service;

    /** 구매내역 조회 */
    @PostMapping("/query")
    public ResMap getPurchaseHistory(@RequestBody PurchaseHistoryParam param) {
        return new ResMap(service.getPurchaseHistory(param));
    }

}
