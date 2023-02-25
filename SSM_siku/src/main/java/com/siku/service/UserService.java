package com.siku.service;

import com.siku.pojo.User;
import com.siku.result.AjaxResult;

import java.util.Map;

public interface UserService {
    public AjaxResult addUser(String nickname, String openId);

    public AjaxResult bindSno(String sno, String isww, String openId);

    public User getUserByOpenId(String openId);

    public AjaxResult getOpenId(String code);

    public AjaxResult updateQQ(String qq,String openId);


    public AjaxResult isFriend(String openId);
}
