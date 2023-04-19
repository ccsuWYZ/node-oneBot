package com.siku.controller;

import com.siku.pojo.Notice;
import com.siku.result.AjaxResult;
import com.siku.service.NoticeService;
import com.siku.service.TikuDetailService;
import com.siku.service.TikuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lee
 * @date 2022-11-27 22:10:22
 * @description
 */
@RestController
@RequestMapping("/skApi")
public class RefreshCacheController {
    @Autowired
    private TikuDetailService tikuDetailService;
    @Autowired
    private TikuService tikuService;

    @GetMapping("/refreshCache")
    @ResponseBody
    public AjaxResult refreshCache(){

//        tikuService.resetConfigCache();
//        tikuDetailService.resetConfigCache();
        return new AjaxResult(200,"刷新缓存成功");
    }
}
