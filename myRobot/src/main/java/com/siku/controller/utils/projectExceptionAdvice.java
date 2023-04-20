package com.siku.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class projectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public Map<String,Object> response_Exception_Data(Exception exception){
        Map<String,Object> data=new HashMap<>();
        data.put("code",500);
        data.put("message","服务器内部错误，请稍后重试");
        exception.printStackTrace();
        return data;
    }
}
