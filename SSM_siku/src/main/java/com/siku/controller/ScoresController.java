package com.siku.controller;


import com.siku.pojo.Courses;
import com.siku.pojo.Scores;
import com.siku.result.AjaxResult;
import com.siku.result.Result;
import com.siku.result.Status;
import com.siku.service.ScoresService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//所有的数据渲染成json
@RequestMapping("skApi/scoreinfo")
public class ScoresController {

    @Autowired
    private ScoresService scoresService;



    @GetMapping
    public AjaxResult getScoresById( String uid,  String year,  String xq){
        return scoresService.getScores(uid, year, xq);
    }

}
