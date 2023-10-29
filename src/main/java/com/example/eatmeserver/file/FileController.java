package com.example.eatmeserver.file;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/file")
public class FileController {
    @PostMapping("/upload")
    public void uploadFile(@RequestPart MultipartFile image) throws Exception {
        String uploadPath = System.getProperty("user.dir") + "\\src\\main\\resource\\static\\image";
        UUID uuid = UUID.randomUUID();
        String fileName = uuid + "_" + image.getOriginalFilename();
        File saveFile = new File(uploadPath, "name");

        image.transferTo(saveFile);
    }

}
