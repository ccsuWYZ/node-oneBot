package com.siku.jobs;//package ly;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.siku.mapper.QqFriendsMapper;
import com.siku.service.SendMessage;
import com.siku.utils.httpUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@EnableScheduling
public class sendCourseMessageJob {

    @Value("${bot.qqNumber}")
    String botQqNumber ;

    @Autowired
    private QqFriendsMapper qqFriendsMapper;

    @Autowired
    private SendMessage sendMessage;


    public void task() throws Exception {

        int count = 0;

        List<Object> numbers = qqFriendsMapper.getAllQqNumber();//从数据库取出要发送的好友qq号

        for (int i = 0; i < numbers.size(); i++) {

            if (botQqNumber.equals(numbers.get(i))) continue;//跳过QQ机器人自己

//            System.out.println(numbers.get(i));

            String sno = (String) qqFriendsMapper.getUserByQq(numbers.get(i));//通过qq号获取学号

                    sendMessage.sendAllDayCourse(sno,numbers.get(i));

            count++;

            Thread.sleep(6000);//避免发消息太快被风控

            if (count == 5) {//每发5条，休息5分钟
                Thread.sleep(60000 * 5);
                count = 0;
            }


        }
    }

}
