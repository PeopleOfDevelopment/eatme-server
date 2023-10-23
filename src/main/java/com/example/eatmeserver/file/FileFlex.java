package com.example.eatmeserver.file;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class FileFlex {
    private UUID imgId;
    private String imgLoc;
    private String imgNm;
    private String corpCd;
    private String userId;
    private String itemCd;
}
