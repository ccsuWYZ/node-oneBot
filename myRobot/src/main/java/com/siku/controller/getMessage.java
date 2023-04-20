package com.siku.controller;


import com.siku.mapper.QqFriendsMapper;
import com.siku.service.SendMessage;
import com.siku.utils.httpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/skapi")
public class getMessage {
//    @Value("${bot.qqNumber}")
//    String botQqNumber ;


    @Value("${owner.qqNumber}")
    String ownerQqNumber;
    @Autowired
    private QqFriendsMapper qqFriendsMapper;
    @Autowired
    private SendMessage sendMessage;

    @PostMapping("/getNotice")
    @ResponseBody
    public Map<String, Object> getMessage(@RequestBody Map<String, Object> request) throws InterruptedException {
        System.out.println(request);
        Map<String, Object> result = new HashMap<>();

        String message_type = (String) request.get("message_type");

        String request_type = (String) request.get("request_type");

        String message = (String) request.get("message");

        String user_id = String.valueOf(request.get("user_id"));


        if ("private".equals(message_type) && ownerQqNumber.equals(user_id)) {//QQ机器人接收到私人消息且是3212384071发来的
            if ("机器人状态".equals(message)) {
                sendMessage.sendStatusMessage();
            }

        //这里用空格切割QQ机器人接收到的消息，比如说：自定义消息 早上好。 [0]就是：自定义消息，[1]就是：早上好

            if ("发送自定义消息".equals(message.split(" ")[0])) {
                //要发送的消息
                String sendToMessage = message.split(" ")[1];
                sendMessage.sendSelf_message(sendToMessage);
            }


        }

        if ("friend".equals(request_type)) {//自动同意好友请求
            qqFriendsMapper.addQQfriend(String.valueOf(request.get("user_id")));
            result.put("approve", true);
            return result;
        }


        return result;
    }


//    @GetMapping("/getStatus")
//    @ResponseBody
//    public String testStatus() {
//        String result = httpUtil.sendGet("http://localhost:5701/get_status");
//
//        return result;
//    }


}
