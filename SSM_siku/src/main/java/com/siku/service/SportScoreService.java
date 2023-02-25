package com.siku.service;

import com.siku.pojo.SportScore;
import com.siku.result.AjaxResult;

import java.util.List;

/**
 * @author lee
 * @date 2022-11-24 15:16:14
 * @description
 */
public interface SportScoreService {
    public AjaxResult getSportScoreList(String sno, String year);
}
