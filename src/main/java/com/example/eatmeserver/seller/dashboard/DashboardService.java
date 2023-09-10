package com.example.eatmeserver.seller.dashboard;

import com.example.eatmeserver.seller.dashboard.model.DashboardParam;
import com.example.eatmeserver.seller.dashboard.model.DashboardQnaDetailFlex;
import com.example.eatmeserver.seller.dashboard.model.DashboardQnaFlex;
import com.example.eatmeserver.seller.dashboard.model.DashboardSellingFlex;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DashboardService {

    private final DashboardMapper mapper;

    /** 매출조회 */
    public String getSelling(DashboardParam param){
        DecimalFormat df = new DecimalFormat("###,###,###,###");
        List<DashboardSellingFlex> result = mapper.getSelling(param);
        int sum = 0;
        for (int i = 0; i < result.size(); i++) {
            sum += result.get(i).getSalePrc() * result.get(i).getSoldQty();
        }

        return df.format(sum);
    }

    /** 문의 조회 */
    public List<DashboardQnaFlex> getQnaList(DashboardParam param) {
        return mapper.selectQna(param);
    }

    /** 문의 상세조회 */
    public DashboardQnaDetailFlex getQnaDetail(DashboardParam param) {
        return mapper.selectQnaDetail(param);
    }

    /** 문의 답변 작성 */
    public int updateQnaAns(DashboardQnaDetailFlex flex) {
        return mapper.updateQna(flex);
    }
}
