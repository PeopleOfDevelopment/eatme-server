package com.example.eatmeserver.file;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FileMapper {

    // 이미지 정보 저장
    int insertImg(FileFlex flex);

    // 가맹점 이미지 저장
    int insertCorpImg(FileFlex flex);

    // 이미지 정보 조회
    FileFlex selectImg(FileParam param);

    // 가맹점 이미지 조회
    FileFlex selectCorpImg(FileParam param);
}
