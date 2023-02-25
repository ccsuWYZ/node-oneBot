package com.siku.controller.utils;

import com.siku.result.AjaxResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class projectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public AjaxResult response_Exception_Data(Exception exception){
        exception.printStackTrace();
        return new AjaxResult(500,"服务器内部错误，请稍后重试");
    }
}
