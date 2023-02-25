package com.siku.service.impl;


import com.siku.mapper.ScoresMapper;
import com.siku.pojo.Scores;
import com.siku.result.AjaxResult;
import com.siku.service.ScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ScoresServiceImpl implements ScoresService {


    @Autowired
    private ScoresMapper scoresMapper;


    @Override
    public AjaxResult getScores(String sno, String year, String xq) {

        return new AjaxResult(200,"获取课表信息成功",scoresMapper.selectScores(sno,year,xq));
    }
}
