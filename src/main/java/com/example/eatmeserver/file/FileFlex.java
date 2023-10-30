package com.example.eatmeserver.file;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Getter @Setter
public class FileFlex {
    private String imgId;
    private String imgLoc;
    private String imgNm;
    private String corpCd;
    private String userId;
    private String itemCd;
}
