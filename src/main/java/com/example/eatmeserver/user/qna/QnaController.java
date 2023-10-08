package com.example.eatmeserver.user.qna;

import com.example.eatmeserver.common.util.collection.ResMap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/qna")
public class QnaController {
    private final QnaService service;

    @PostMapping("/query")
    public ResMap getQnaList(@RequestBody QnaParam param) {
        return new ResMap(service.getQnaList(param));
    }

    @PostMapping("/insert")
    public int insertQna(@RequestBody QnaFlex flex) {
        return service.insertQna(flex);
    }

    @PostMapping("/delete")
    public int deleteQna(@RequestBody QnaFlex flex) {
        return service.deleteQna(flex);
    }

    @PostMapping("/update")
    public int updateQna(@RequestBody QnaFlex flex) {
        return service.updateQna(flex);
    }
}
