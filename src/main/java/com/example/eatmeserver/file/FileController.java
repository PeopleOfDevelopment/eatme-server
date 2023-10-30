package com.example.eatmeserver.file;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/file")
public class FileController {

    private final FileService service;

    @PostMapping("/upload")
    public void uploadFile(@RequestPart MultipartFile image, @RequestBody FileFlex flex) throws Exception {
        service.saveImg(flex, image);
    }

    @PostMapping("/getImg/{corpCd}/{itemCd}")
    public ResponseEntity<byte[]> getImage(@PathVariable String corpCd, @PathVariable String itemCd) throws Exception{
        return service.getImage(corpCd, itemCd);
    }


}
