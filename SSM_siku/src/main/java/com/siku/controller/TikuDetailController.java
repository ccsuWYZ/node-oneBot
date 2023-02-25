package com.siku.controller;


import com.siku.pojo.TikuDetail;
import com.siku.result.AjaxResult;
import com.siku.result.Result;
import com.siku.result.Status;
import com.siku.service.TikuDetailService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/skApi")
public class TikuDetailController {

    @Autowired
    private TikuDetailService tikuDetailService;

    @GetMapping("/questionsList")
    public AjaxResult getAllByBankId( String bankId){
        return tikuDetailService.selectAll(bankId);
    }
}
