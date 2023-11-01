package com.example.eatmeserver.file;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FileService {

    private final FileMapper mapper;

    @Transactional
    public int saveImg(FileFlex flex, MultipartFile file) throws Exception{
        String uploadPath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\image";
//        String uploadPath = "C:/upload";
        UUID uuid = UUID.randomUUID();

        String fileName = uuid + "_" + file.getOriginalFilename();
        File saveFile = new File(uploadPath, fileName);
        file.transferTo(saveFile);

        flex.setImgId(uuid.toString());
        flex.setImgNm(file.getOriginalFilename());
        flex.setImgLoc(uploadPath);

        return mapper.insertImg(flex);
    }

    public ResponseEntity<byte[]> getImage(FileParam param) throws Exception{
        String uploadPath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\image";
        FileFlex flex = mapper.selectImg(param);
        String fileName = flex.getImgId().toString() + "_" + flex.getImgNm();
        File file = new File(uploadPath, fileName);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        return new ResponseEntity<>(FileCopyUtils.copyToByteArray(file), headers, HttpStatus.OK);
    }

    public FileFlex getImageInfo(FileParam param) {
        return mapper.selectImg(param);
    }
}
