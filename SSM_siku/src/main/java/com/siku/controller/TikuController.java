package com.siku.controller;



import com.siku.pojo.Tiku;
import com.siku.result.AjaxResult;
import com.siku.result.Result;
import com.siku.result.Status;
import com.siku.service.TikuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/skApi")
public class TikuController {

    @Autowired
    private TikuService tikuService;

    @GetMapping("/BankList")
    public AjaxResult getAllTiku(){
        return tikuService.selectAll();
    }
}
