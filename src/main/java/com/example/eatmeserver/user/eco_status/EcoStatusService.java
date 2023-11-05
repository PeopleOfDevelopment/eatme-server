package com.example.eatmeserver.user.eco_status;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EcoStatusService {
    private final EcoStatusMapper mapper;

    final int TREE_CONSTANT = 4;

    public EcoStatusResult getStatus() {
        List<EcoStatusFlex> ecoResultList = mapper.selectEco();
        int saveTree = 0;
        int allSaleAmt = 0;
        int allSalePrc = 0;
        // 판매 수량 누적
        for(EcoStatusFlex list : ecoResultList) {
            saveTree += list.getSaleAmt();
            allSalePrc += list.getSalePrc() * list.getSaleAmt();
        }

        allSaleAmt = saveTree;
        saveTree = saveTree / TREE_CONSTANT;
        return new EcoStatusResult(saveTree, allSaleAmt, allSalePrc);
    }

}
