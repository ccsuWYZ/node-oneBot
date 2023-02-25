package com.siku.service;

import com.siku.pojo.SelfCountDown;
import com.siku.result.AjaxResult;

public interface countDownService {
   public AjaxResult addCountDown(SelfCountDown selfCountDown);
   public AjaxResult getCountDown(String sno);
   public AjaxResult delCountDown(SelfCountDown selfCountDown);
}
