package com.siku.controller;

import com.siku.pojo.LostFound;
import com.siku.result.AjaxResult;
import com.siku.result.Result;
import com.siku.result.Status;
import com.siku.service.LostFoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lee
 * @date 2022-11-24 15:44:51
 * @description
 */
@RestController
@RequestMapping("/skApi")
public class LostAndFoundController {
    @Autowired
    private LostFoundService lostFoundService;

    @ResponseBody
    @GetMapping("/lostlist")
    public AjaxResult getAllLostFound() {
        return lostFoundService.getAllLostFound();
    }

    @ResponseBody
    @PostMapping("/publost")
    public Map<String, Object> pubLostFound(@RequestBody LostFound lostFound) {
        System.out.println(lostFound);
        return lostFoundService.pubLostFound(lostFound);
    }

    @ResponseBody
    @GetMapping("/deleteLost")
    public AjaxResult delLostFound(int id) {
        return lostFoundService.delLostFound(id);
    }


    @ResponseBody
    @GetMapping("/lostStatus")
    public AjaxResult updateStatus(int id) {
        return lostFoundService.updateStatus(id);
    }

}
