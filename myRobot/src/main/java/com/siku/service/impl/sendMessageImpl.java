package com.siku.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.siku.mapper.CourseMapper;
import com.siku.mapper.QqFriendsMapper;
import com.siku.service.SendMessage;
import com.siku.utils.CourseInfo;
import com.siku.utils.dateInfo;
import com.siku.utils.httpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class sendMessageImpl implements SendMessage {

    @Value("${bot.qqNumber}")
    String botQqNumber ;


    @Value("${owner.qqNumber}")
    String ownerQqNumber;

    @Autowired
    private QqFriendsMapper qqFriendsMapper;

    @Autowired
    private CourseMapper courseInfoMapper;

    @Override
    public void sendAllDayCourse(String sno, Object qqNumber) throws InterruptedException {//发送课表消息


        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date d = new Date();//获取方法运行的时间

        Calendar calendar = new GregorianCalendar();

        calendar.setTime(d);//用给定的日期设置Calendar的当前时间。

        calendar.add(calendar.DATE, 1);//把日期往前减少一天，若想把日期向后推一天则将负数改为正数，此处是把当前时间加一天

        d = calendar.getTime();

        String startday = "2023-02-13";//开学日期

//        System.out.println("明天日期：" + format.format(d));

//        System.out.println("开学日期：" + startday);

        //计算当前日期是开学的第几周
        Date d1 = null;
        try {
            d1 = format.parse(startday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int weeks = dateInfo.getTommrowWhichWeek(d, d1);//开学第几周

//        String currSun = dateFm.format(d);//获取当前日期是星期几

//        System.out.println("当天为开学第" + weeks + "周---" + currSun);

        //得到格式化后的课程表数据
        String courses = CourseInfo.formateCourse(courseInfoMapper.getAllDayCourseInfo(sno, dateInfo.getWeekDay(), "2022"), String.valueOf(weeks));

        //封装
        Map<String, Object> body = new HashMap<>();

        body.put("message", courses);

        body.put("user_id", qqNumber);

        String json = JSON.toJSONString(body);//map转String

        JSONObject jsonObject = JSON.parseObject(json);//String转json

        //发送
        httpUtil.sendPost(jsonObject, "http://localhost:5701/send_private_msg_rate_limited");


    }

    @Override
    public void sendStatusMessage() {//发送状态消息

        String result = httpUtil.sendGet("http://localhost:5701/get_status");//获取机器人状态

        Map<String, Object> sendMessage = new HashMap<>();

        sendMessage.put("user_id", ownerQqNumber);//发送给机器人创建者

        //这里可以去看文档，了解消息载体的格式
        Map<String, Object> map = JSONObject.parseObject(result, new TypeReference<Map<String, Object>>() {
        });

        Map<String, Object> data = JSONObject.parseObject((map.get("data").toString()), new TypeReference<Map<String, Object>>() {
        });

        String online = String.valueOf(data.get("online"));

        String status = String.valueOf(map.get("status"));

        if ("true".equals(online) && "ok".equals(status)) {
            sendMessage.put("message", "目前机器人运行一切正常");
        } else {
            sendMessage.put("message", "机器人运行出了点问题");
        }
        System.out.println(online + "----" + status);

        String json = JSON.toJSONString(sendMessage);//map转String

        JSONObject jsonObject = JSON.parseObject(json);//String转json

        httpUtil.sendPost(jsonObject, "http://localhost:5701/send_private_msg_rate_limited");

    }




    //发送自定义消息，由开发者确认发消息的qq号，这里是3212384071,格式暂定为  发送自定义消息 消息内容  注：目前只能发普通文本，表情或者颜文字好像都不行
    @Override
    public void sendSelf_message(String message) throws InterruptedException {
        Map<String, Object> sendMessage = new HashMap<>();

        sendMessage.put("message", message);
        int count = 0;
//        上线
        List<Object> numbers = qqFriendsMapper.getAllQqNumber();
        for (int i = 0; i < numbers.size(); i++) {
            if (String.valueOf(numbers.get(i)).equals(botQqNumber) || String.valueOf(numbers.get(i)).equals(ownerQqNumber))
                continue;
            sendMessage.put("user_id", String.valueOf(numbers.get(i)));
            String json = JSON.toJSONString(sendMessage);//map转String
            JSONObject jsonObject = JSON.parseObject(json);//String转json
            httpUtil.sendPost(jsonObject, "http://localhost:5701/send_private_msg_rate_limited");
            System.out.println(jsonObject);
            count++;
            Thread.sleep(6000);
            if (count == 5) {
                Thread.sleep(60000 * 3);
                count = 0;
            }
        }


////        本地测试用
//        String result=  httpUtil.sendGet("http://localhost:5701/get_friend_list");
//        Map<String, Object> map = JSONObject.parseObject(result, new TypeReference<Map<String, Object>>() {});
//        List<qqUser> qqUsers=JSONObject.parseObject((map.get("data").toString()), new TypeReference<List<qqUser>>(){});
//        for (int i = 0; i < qqUsers.size(); i++) {
//            if(String.valueOf(qqUsers.get(i).getUser_id()).equals("3286617400")||
//                    String.valueOf(qqUsers.get(i).getUser_id()).equals("807768046")||
//                    String.valueOf(qqUsers.get(i).getUser_id()).equals("3212384071"))continue;
//            sendMessage.put("user_id",String.valueOf(qqUsers.get(i).getUser_id()));
//            String json = JSON.toJSONString(sendMessage);//map转String
//            JSONObject jsonObject = JSON.parseObject(json);//String转json
//            httpUtil.sendPost(jsonObject, "http://localhost:5701/send_private_msg_rate_limited");
//            System.out.println(jsonObject);
//            count++;
//            Thread.sleep(6000);
////            if (count == 5) {
////                Thread.sleep(60000*5);
////                count = 0;
////            }

    }


}




