package com.siku.interceptor;

import com.alibaba.fastjson.JSON;
import com.siku.utils.jwtUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
public class TokenInterceptor implements HandlerInterceptor {
    /**
     * 拦截器和过滤器的区别
     * 1.拦截器针对访问控制器进行拦截
     * 及 @RequestMapping(value = {"/test"})
     * 简而言说就是访问方法的url
     * 应用：可以作为权限的判断，
     * 2.过滤器则是针对全局的请求
     * 包括：css/js/html/jpg/png/git/...
     * 及静态文件
     * 20200417 23:13
     */

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("执行方法之前执行这步操作！");
        String token=request.getHeader("token");
        System.out.println(request.getRequestURI());
        response.setHeader("content-type","text/html;charset=utf-8");
        Map<String,Object> resdata=new HashMap<>();
        if( token !=null){
            boolean isRightToken= jwtUtil.verify(token);
            if(isRightToken){
                return true;
            }else{
                resdata.put("code",400);
                resdata.put("message","用户信息校验失败，token有误");
                response.getWriter().write(JSON.toJSONString(resdata));
                return false;
            }
        }else{
            resdata.put("code",400);
            resdata.put("message","用户信息校验失败,token为空");
            response.getWriter().write(JSON.toJSONString(resdata));
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
