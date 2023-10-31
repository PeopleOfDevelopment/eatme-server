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

    @PostMapping("/getImg")
    public ResponseEntity<byte[]> getImage(@RequestBody FileParam param) throws Exception{
        return service.getImage(param);
    }


}
