package com.example.eatmeserver.user.qna;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QnaService {
    private final QnaMapper mapper;

    public List<QnaFlex> getQnaList(QnaParam param) {
        return mapper.selectQna(param);
    }

    @Transactional
    public int insertQna(QnaFlex flex) {
        return mapper.insertQna(flex);
    }

    @Transactional
    public int deleteQna(QnaFlex flex) {
        return mapper.deleteQna(flex);
    }

    @Transactional
    public int updateQna(QnaFlex flex) {
        return mapper.updateQna(flex);
    }
}
