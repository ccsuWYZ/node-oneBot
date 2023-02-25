package com.siku.controller;

import com.siku.pojo.Notice;
import com.siku.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lee
 * @date 2022-11-24 14:19:18
 * @description
 */
@RestController
@RequestMapping("/skApi")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;
    @GetMapping("/getNotice")
    @ResponseBody
    public Notice getNotice(){
        return noticeService.getNotice();
    }
}
