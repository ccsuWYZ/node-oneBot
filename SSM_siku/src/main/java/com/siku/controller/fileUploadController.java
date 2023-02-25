package com.siku.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/skApi")
public class fileUploadController {
    @Value("${file.location}")
    String path ;

    @Value("${file.returnUrl}")
    String url;

    @PostMapping(value = "/uploadImage")
    @ResponseBody
    public Map<String, String> uploadImage(@RequestPart("photoUpload")MultipartFile photoUpload,HttpSession httpSession) throws IOException {
//        String realpath = httpSession.getServletContext().getRealPath("uploadImages");
        // 获取上传的文件拓展名
        Map<String,String> resData=new HashMap<>();
        String exetendFileName = photoUpload.getOriginalFilename().split("\\.")[1];
        //为了确保上传文件的重名问题，对文件名进行处理
        String keepName = UUID.randomUUID().toString() +"."+ exetendFileName;
        // 根据路径构建文件对象
        // 在构建过程中一定要注意路径问题

        File uploadFile = new File(path, keepName);
        // 判断指定文件夹uploadfiles是否存在，不存在就创建
        if (!uploadFile.exists()) {
            uploadFile.mkdirs();
        }
        // 上传文件
        photoUpload.transferTo(uploadFile);
        resData.put("url",url+keepName);
        return resData;
    }

}
