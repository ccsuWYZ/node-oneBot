package com.siku.jobs;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.siku.mapper.QqFriendsMapper;
import com.siku.pojo.qqUser;
import com.siku.utils.httpUtil;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@EnableScheduling
public class UpdateQqNumber   {

    /**
     * 建议可以把数据库里面的qq号和现有的好友列表做对比，已经删除好友的可以从数据库删除该qq号，就留给你们做咯！！！
     * 这里只是遍历一下看看有没有新加的好友
     */

    @Autowired
    private QqFriendsMapper qqFriendsMapper;
    public void task(){
        String result=  httpUtil.sendGet("http://localhost:5701/get_friend_list");//获取现有好友列表

        Map<String, Object> map = JSONObject.parseObject(result, new TypeReference<Map<String, Object>>() {});//把它转化为map集合

        List<qqUser> qqUsers=JSONObject.parseObject((map.get("data").toString()), new TypeReference<List<qqUser>>(){});//把它转化为list



        for (int i = 0; i < qqUsers.size(); i++) {
//            System.out.println(qqUsers.get(i).getUser_id());
           qqFriendsMapper.addQQfriend( qqUsers.get(i).getUser_id());
        }



    }
}
