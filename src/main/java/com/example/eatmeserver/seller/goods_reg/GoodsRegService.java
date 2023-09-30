package com.example.eatmeserver.seller.goods_reg;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GoodsRegService {
    private final GoodsRegMapper mapper;

    @Transactional
    public int insertGoods(List<GoodsRegFlex> flexList){
        int result = 0;
        System.out.println(flexList.get(0));
        for (int i = 0; i < flexList.size(); i++) {
            mapper.insertGoods(flexList.get(i));
            result++;
        }
        return result;
    }
    @Transactional
    public int updateGoods(List<GoodsRegFlex> flexList){
        int result = 0;
        for (int i = 0; i < flexList.size(); i++) {
            mapper.updateGoods(flexList.get(i));
            result++;
        }
        return result;
    }
    @Transactional
    public int deleteGoods(List<GoodsRegFlex> flexList){
        int result = 0;
        for (int i = 0; i < flexList.size(); i++) {
            mapper.deleteGoods(flexList.get(i));
            result++;
        }
        return result;
    }

    public List<GoodsRegFlex> selectGoods(GoodsRegParam param) {
        return mapper.selectGoods(param);
    }
}
