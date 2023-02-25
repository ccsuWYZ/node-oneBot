package com.siku.service.impl;

import com.siku.mapper.ScoresMapper;
import com.siku.mapper.SportScoreMapper;
import com.siku.pojo.SportScore;
import com.siku.result.AjaxResult;
import com.siku.service.SportScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lee
 * @date 2022-11-24 15:17:42
 * @description
 */
@Service
public class SportScoreImpl implements SportScoreService {
    @Autowired
    private SportScoreMapper sportScoreMapper;

    @Override
    public AjaxResult getSportScoreList(String sno, String year) {
        return new AjaxResult(200,"获取体测成绩成功",sportScoreMapper.getSportScoreByCondition(sno,year));
    }
}
