package com.siku.config;

import com.siku.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        使用excludePathPatterns() 放行时，放行的接口不存在，springboot会转至/error，从而进入拦截器
        registry.addInterceptor(new TokenInterceptor()).addPathPatterns("/**").excludePathPatterns("/skApi/userinfo","/","/hello.html","/skApi/getopenid","/skApi/uploadImages/**","/skApi/getNotice","/skApi/refreshCache");

    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

}
