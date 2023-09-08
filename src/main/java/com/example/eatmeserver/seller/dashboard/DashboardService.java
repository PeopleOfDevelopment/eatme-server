package com.example.eatmeserver.seller.dashboard;

import com.example.eatmeserver.seller.dashboard.model.DashboardParam;
import com.example.eatmeserver.seller.dashboard.model.DashboardSellingFlex;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DashboardService {

    private final DashboardMapper mapper;

    /** 매출조회 */
    public int getSelling(DashboardParam param){
        List<DashboardSellingFlex> result = mapper.getSelling(param);
        int sum = 0;
        for (int i = 0; i < result.size(); i++) {
            sum += result.get(i).getSellPrc();
        }
        return sum;
    }
}
