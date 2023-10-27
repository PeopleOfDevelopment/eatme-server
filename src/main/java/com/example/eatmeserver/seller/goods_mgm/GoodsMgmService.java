package com.example.eatmeserver.seller.goods_mgm;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GoodsMgmService {
    private final GoodsMgmMapper mapper;

    public GoodsMgmResult getSelling(GoodsMgmParam param) {
        GoodsMgmResult result = new GoodsMgmResult();
        List<GoodsMgmFlex> queryResult = mapper.selectSelling(param);
        List<GoodsMgmFlex> pick = new ArrayList<GoodsMgmFlex>();
        List<GoodsMgmFlex> deli = new ArrayList<GoodsMgmFlex>();

        for(GoodsMgmFlex flex : queryResult) {
            if(flex.getPickYn() != null && flex.getPickYn().equals("1")) pick.add(flex);
            else if (flex.getPickYn() != null && flex.getPickYn().equals("0")) deli.add(flex);
        }
        result.setSellingAll(mapper.selectGoods(param));
        result.setSellingPick(pick);
        result.setSellingDeli(deli);

        return result;
    }
}
