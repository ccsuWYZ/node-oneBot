package com.siku.controller;


import com.siku.pojo.SelfCountDown;
import com.siku.result.AjaxResult;
import com.siku.service.countDownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/skApi")
public class selfCountDownController {

    @Autowired
    private countDownService countDownService;

    @GetMapping("/getCountDown")
    @ResponseBody
    public AjaxResult getAllSelfCountDown(String sno) {
        return countDownService.getCountDown(sno);
    }

    @PostMapping("/addCountDown")
    @ResponseBody
    public AjaxResult addCountDown(@RequestBody SelfCountDown selfCountDown) {
            return countDownService.addCountDown(selfCountDown);
    }


    @PostMapping("/delCountDown")
    @ResponseBody
    public AjaxResult delCountDown( @RequestBody SelfCountDown selfCountDown) {
        System.out.println(selfCountDown);
        return countDownService.delCountDown(selfCountDown);
    }

}
