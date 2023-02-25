package com.siku.controller;


import com.siku.pojo.Test;
import com.siku.result.AjaxResult;
import com.siku.result.Result;
import com.siku.result.Status;
import com.siku.service.TestService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//所有的数据渲染成json
@RequestMapping("skApi")
public class TestController {

    @Autowired
    private TestService testService;

     @GetMapping("/examinfo")
    public AjaxResult getTestByUid( String uid){
        return testService.getTests(uid);
    }
}
