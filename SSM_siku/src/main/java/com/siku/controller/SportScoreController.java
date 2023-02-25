package com.siku.controller;

import com.siku.pojo.SportScore;
import com.siku.result.AjaxResult;
import com.siku.result.Result;
import com.siku.result.Status;
import com.siku.service.SportScoreService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author lee
 * @date 2022-11-24 15:19:24
 * @description
 */
@RestController
@RequestMapping("skApi")
public class SportScoreController {
    @Autowired
    private SportScoreService sportScoreService;

    @GetMapping("/sportScore")
    @ResponseBody
    public AjaxResult getSportList(String sno, String year) {
        return sportScoreService.getSportScoreList(sno, year);
    }
}
