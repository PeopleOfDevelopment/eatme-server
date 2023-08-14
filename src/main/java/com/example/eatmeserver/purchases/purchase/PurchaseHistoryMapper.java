package com.example.eatmeserver.purchases.purchase;
import com.example.eatmeserver.purchases.purchase.model.PurchaseHistoryDParam;
import com.example.eatmeserver.purchases.purchase.model.PurchaseHistoryFlex;
import com.example.eatmeserver.purchases.purchase.model.PurchaseHistoryParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PurchaseHistoryMapper {

    /** 구매내역조회 */
    List<PurchaseHistoryFlex> selectPurchaseHistory(PurchaseHistoryParam param);

    /** 구매내역 상세조회 */
    PurchaseHistoryFlex selectPurchaseHistoryD(PurchaseHistoryDParam param);
}
