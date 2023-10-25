package com.example.eatmeserver.user.eco_status;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EcoStatusService {
    private final EcoStatusMapper mapper;

    final int TREECONSTANT = 4;

    public EcoStatusResult getStatus(EcoStatusParam param) {
        List<EcoStatusFlex> ecoResultList = mapper.selectEco(param);
        int saveTree = 0;
        int thisYearStatus = 0;
        int lastYearStatus = 0;

        // 판매 수량 누적
        for(EcoStatusFlex list : ecoResultList) {
            saveTree += list.getItemQty();
        }

        saveTree = saveTree / TREECONSTANT;

        return new EcoStatusResult(saveTree, thisYearStatus, lastYearStatus);
    }

}
