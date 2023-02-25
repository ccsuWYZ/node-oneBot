package com.siku.service.impl;


import com.siku.mapper.TestMapper;
import com.siku.pojo.Test;
import com.siku.result.AjaxResult;
import com.siku.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private TestMapper testMapper;



    @Override
    public AjaxResult getTests(String sno) {
        return new AjaxResult(200,"获取考试信息成功",testMapper.selectTest(sno));
    }
}
