package com.siku.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.siku.mapper.UserMapper;
import com.siku.pojo.User;
import com.siku.result.AjaxResult;
import com.siku.service.UserService;
import com.siku.utils.WeChatUtil;
import com.siku.utils.jwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    private User user = null;
    @Autowired
    private UserMapper userMapper;
    ObjectMapper objectMapper = new ObjectMapper();

    String token=null;
    @Override
    public AjaxResult addUser(String nickname, String openId) {
        Map<String, Object> response_data=new HashMap<>();
        user = userMapper.getUserByid(openId);
        token = jwtUtil.sign(nickname,openId);
        if (null == user) {
            int result = userMapper.addUser(nickname, openId);
            if (result == 1) {//新增成功
                response_data.put("token",token);
                return new AjaxResult(200,"微信授权成功",response_data);
            } else {//新增失败
                return new AjaxResult(200,"微信授权失败");
            }
        } else {//用户已经存在
            response_data = objectMapper.convertValue(user, new com.fasterxml.jackson.core.type.TypeReference<Map<String, Object>>() {
            });
            response_data.put("token",token);
            return new AjaxResult(201,"用户已存在",response_data);
        }

    }

    @Override
    public AjaxResult bindSno(String sno, String isww, String openId) {
        Map<String, Object> response_data=new HashMap<>();
        int result=  userMapper.bindSno(sno,isww,openId);
        if(result==1){
            return new AjaxResult(200,"学号绑定成功");
        }else{
            return new AjaxResult(500,"学号绑定失败");
        }

    }

    @Override
    public User getUserByOpenId(String openId) {
         return userMapper.getUserByid(openId);
    }

    @Override
    public AjaxResult getOpenId(String code) {
        Map<String, String> stringMap = WeChatUtil.acquireSessionKeyAndOpenId(code);
        stringMap.remove("sessionKey");
        String openId = stringMap.get("openid");
        if (openId == null) {
            return new AjaxResult(201,"获取openid失败");
        } else {
            return new AjaxResult(200,"获取openid成功",openId);
        }
    }

    @Override
    public AjaxResult updateQQ(String qq, String openId) {
        int result=userMapper.updateQQ(qq,openId);
        if(result==1){
            return new AjaxResult(200,"绑定QQ成功");
        }
        return new AjaxResult(201,"绑定QQ失败");
    }

    @Override
    public AjaxResult isFriend(String openId) {
        //用来检验是否订阅了消息
        String qqnumberByUser=userMapper.getQQbyId(openId);

        //用来检验是否添加qq好友
        String qqnumberByAddQQ=userMapper.getQQ(qqnumberByUser);

        Map<String,Object> resultData=new HashMap<>();

        if(qqnumberByUser!=null){//订阅了消息

            if(qqnumberByAddQQ!=null){//添加了qq好友
                resultData.put("isFriend",1);
                resultData.put("qq",qqnumberByUser);
                return new AjaxResult(200,"成功绑定qq",resultData);
            }else{//未添加qq好友
                resultData.put("isFriend",0);
                resultData.put("qq",qqnumberByUser);
                return new AjaxResult(201,"未添加小助手QQ",resultData);
            }
        }else{
            resultData.put("isFriend",-1);
            resultData.put("qq",qqnumberByUser);
            return new AjaxResult(201,"您还订阅消息",resultData);
        }

    }
}
