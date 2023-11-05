package com.example.eatmeserver.file;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.json.simple.parser.JSONParser;
import org.springframework.asm.TypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/file")
@Data
public class FileController {

    private final FileService service;

    @PostMapping("/upload")
    public void uploadFile(@RequestParam("imageInfo") String flexJson, @RequestPart("imageData") MultipartFile imageData) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        FileFlex flex = mapper.readValue(flexJson, FileFlex.class);

        service.saveImg(flex, imageData);
    }

    @GetMapping("/getImg")
    public ResponseEntity<byte[]> getImage(@RequestParam("corpCd") String corpCd, @RequestParam("itemCd") String itemCd) throws Exception{
        FileParam param = new FileParam();
        param.setCorpCd(corpCd);
        param.setItemCd(itemCd);
        return service.getImage(param);
    }

    @PostMapping("/uploadCorp")
    public void uploadCorpFile(@RequestParam("imageInfo") String flexJson, @RequestPart("imageData") MultipartFile imageData) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        FileFlex flex = mapper.readValue(flexJson, FileFlex.class);

        service.saveCorpImg(flex, imageData);
    }

    @GetMapping("/getCorpImg")
    public ResponseEntity<byte[]> getCorpImage(@RequestParam("corpCd") String corpCd) throws Exception{
        FileParam param = new FileParam();
        param.setCorpCd(corpCd);
        return service.getCorpImage(param);
    }

    @PostMapping("/getImgInfo")
    public FileFlex getImageInfo(@RequestBody FileParam param) {
        return service.getImageInfo(param);
    }


}
