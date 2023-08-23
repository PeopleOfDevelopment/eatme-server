package com.example.eatmeserver.seller.item_reg;

import com.example.eatmeserver.common.util.collection.ResMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/itemReg")
public class ItemRegController {

    private final ItemRegService service;

    @PostMapping("/insert")
    public int insertItems(@RequestBody List<ItemRegFlex> flex) {
        return service.insertItems(flex);
    }

    @PostMapping("/query")
    public ResMap getItems(@RequestBody ItemRegParam param) {
        return new ResMap(service.getItems(param));
    }

    @PostMapping("/update")
    public int updateItem(@RequestBody ItemRegFlex flex) {
        return service.updateItem(flex);
    }

    @PostMapping("/delete")
    public int deleteItem(@RequestBody ItemRegParam param) {
        return service.deleteItem(param);
    }
}
