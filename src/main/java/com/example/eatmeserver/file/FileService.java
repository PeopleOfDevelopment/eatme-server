package com.example.eatmeserver.file;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
    public int saveImg(FileFlex flex, MultipartFile image) throws Exception{
        String uploadPath = System.getProperty("user.dir") + "\\src\\main\\resource\\static\\image";
        UUID uuid = UUID.randomUUID();

        try {
            String fileName = uuid + "_" + image.getOriginalFilename();
            File saveFile = new File(uploadPath, fileName);
            image.transferTo(saveFile);
        }catch (Exception e) {
            return 0;
        }

        flex.setImgId(uuid);
        flex.setImgNm(image.getOriginalFilename());
        flex.setImgLoc(uploadPath);

        return mapper.insertImg(flex);
    }

    public ResponseEntity<byte[]> getImage(String corpCd, String itemCd) throws Exception{
        FileParam param = new FileParam();
        param.setCorpCd(corpCd);
        param.setItemCd(itemCd);
        FileFlex flex = mapper.selectImg(param);

        Path path = Paths.get(flex.getImgLoc(), flex.getImgId().toString());
        byte[] imageBytes = Files.readAllBytes(path);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
    }
}
