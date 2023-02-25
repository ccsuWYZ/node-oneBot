package com.siku.service.impl;


import com.siku.mapper.CourseMapper;
import com.siku.pojo.Courses;
import com.siku.result.AjaxResult;
import com.siku.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseServiceImpl implements CourseService {


    @Autowired
    private CourseMapper courseMapper;


    @Override
    public AjaxResult getCourse(String sno, String year, String xq) {
        return new AjaxResult(200, "获取成功", courseMapper.selectCourse(sno, year, xq));
    }


}
