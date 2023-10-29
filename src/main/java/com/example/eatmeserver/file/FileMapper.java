package com.example.eatmeserver.file;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FileMapper {

    // 이미지 정보 저장
    int insertImg(FileFlex flex);

    // 이미지 정보 조회
    FileFlex selectImg(FileParam param);
}
