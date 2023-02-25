package com.siku.controller;


import com.siku.result.AjaxResult;
import com.siku.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController

@RequestMapping("/skApi/courseinfo")
public class CourseController {

    @Autowired
    private CourseService courseService;


    @GetMapping
    public AjaxResult getCourseByThree(String uid, String year, String xq) {
        return courseService.getCourse(uid, year, xq);
    }

}
