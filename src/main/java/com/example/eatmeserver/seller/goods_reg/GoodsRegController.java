package com.example.eatmeserver.seller.goods_reg;

import com.example.eatmeserver.common.util.collection.ResMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/goodsReg")
public class GoodsRegController {
    private final GoodsRegService service;

    @PostMapping("/insert")
    public int insertGoods(@RequestBody List<GoodsRegFlex> flexList) {
        return service.insertGoods(flexList);
    }

    @PostMapping("/update")
    public int updateGoods(@RequestBody List<GoodsRegFlex> flexList) {
        return service.updateGoods(flexList);
    }

    @PostMapping("/delete")
    public int deleteGoods(@RequestBody List<GoodsRegFlex> flexList) {
        return service.deleteGoods(flexList);
    }

    @PostMapping("/query")
    public ResMap selectGoods(@RequestBody GoodsRegParam param) {
        return new ResMap(service.selectGoods(param));
    }

}
