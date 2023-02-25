package com.siku.service;


import com.siku.pojo.Scores;
import com.siku.result.AjaxResult;
import org.springframework.stereotype.Service;

import java.util.List;



public interface ScoresService {


    AjaxResult getScores(String sno, String year, String xq);
}
