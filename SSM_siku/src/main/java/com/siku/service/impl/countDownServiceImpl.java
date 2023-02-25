package com.siku.service.impl;

import com.siku.mapper.countDownMapper;
import com.siku.pojo.SelfCountDown;
import com.siku.result.AjaxResult;
import com.siku.service.countDownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class countDownServiceImpl implements countDownService {
    @Autowired
    private countDownMapper countDownMapper;
    @Override
    public AjaxResult addCountDown(SelfCountDown selfCountDown) {
        int result=countDownMapper.addCountDown(selfCountDown );
        if(result==1){
            return new AjaxResult(200,"新增倒计时成功");
        }else{
            return new AjaxResult(201,"新增倒计时失败");
        }
    }

    @Override
    public AjaxResult getCountDown(String sno) {
        return new AjaxResult(200,"获取倒计时成功",countDownMapper.getCountDown(sno));
    }

    @Override
    public AjaxResult delCountDown(SelfCountDown selfCountDown) {
        int result=countDownMapper.delCountDown(selfCountDown);
        if(result==1){
            return new AjaxResult(200,"删除倒计时成功");
        }else{
            return new AjaxResult(201,"删除倒计时失败");
        }
    }
}
