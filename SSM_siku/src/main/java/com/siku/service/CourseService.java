package com.siku.service;


import com.siku.pojo.Courses;
import com.siku.result.AjaxResult;

import java.util.List;

public interface CourseService {

    AjaxResult getCourse(String sno, String year, String xq);
}
