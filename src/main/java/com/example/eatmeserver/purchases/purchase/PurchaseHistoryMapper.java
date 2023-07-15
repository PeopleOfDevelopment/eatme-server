package com.example.eatmeserver.purchases.purchase;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PurchaseHistoryMapper {

    List<PurchaseHistoryFlex> getPurchaseHistory(PurchaseHistoryParam param);
}
