package com.siku.mapper;

import com.siku.pojo.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseMapper {
    @Select("select * from courses where sno=#{sno} and weekday=#{weekday} and go_year=#{go_year}")
    public List<Course> getAllDayCourseInfo(String sno, String weekday, String go_year);
}
