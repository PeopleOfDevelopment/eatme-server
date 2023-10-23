package com.example.eatmeserver.file;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class FileParam {
    private UUID imgId;
    private String imgNm;
    private String imgLoc;
    private String corpCd;
    private String itemCd;
    private String userId;

}
