package com.siku.controller;

import com.siku.mapper.UserMapper;
import com.siku.result.AjaxResult;
import com.siku.service.UserService;
import com.siku.utils.WeChatUtil;

//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.AccountException;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static com.siku.utils.WeChatUtil.acquireSessionKeyAndOpenId;


@RestController
@RequestMapping("/skApi")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping(value = "/userinfo")
    @ResponseBody

    public AjaxResult userinfo(@RequestBody Map<String, String> stringObjectMap) {
        return userService.addUser(stringObjectMap.get("nickName"), stringObjectMap.get("openId"));
    }


    @PostMapping(value = "/bindsno")
    @ResponseBody

    public AjaxResult bindsno(@RequestBody Map<String, String> stringObjectMap) {
        return userService.bindSno(stringObjectMap.get("userid"),stringObjectMap.get("isww"),stringObjectMap.get("openId"));
    }


    @GetMapping(value = "/getopenid")
    @ResponseBody

    public AjaxResult getopenid(String code) throws Exception {
        return userService.getOpenId(code);

    }


    @PostMapping(value = "/bindq")
    @ResponseBody
    public AjaxResult bindQ(String qq,String openId) {
        return userService.updateQQ(qq,openId);
    }

    @GetMapping(value = "/isfriend")
    @ResponseBody

    public AjaxResult isfriend(String openId)  {
        return userService.isFriend(openId);

    }
}
