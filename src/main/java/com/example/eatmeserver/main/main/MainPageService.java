package com.example.eatmeserver.main.main;

import com.example.eatmeserver.main.main.model.MainPageCorpFlex;
import com.example.eatmeserver.main.main.model.MainPageItemFlex;
import com.example.eatmeserver.main.main.model.MainPageParam;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainPageService {

    private final MainPageMapper mapper;

    public List<MainPageCorpFlex> getCorp5(MainPageParam param) {
        return mapper.selectCorp5(param);
    }

    public List<MainPageItemFlex> getItem5(MainPageParam param) {
        return mapper.selectItem5(param);
    }
}
