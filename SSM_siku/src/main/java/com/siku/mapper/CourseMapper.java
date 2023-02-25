package com.siku.mapper;



import com.siku.pojo.Courses;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;


@Mapper
public interface CourseMapper{

    //三者

//    select tname as tec ,cname as sub,address as addr ,date ,weekday ,odate from courses where sno='B20200304311' and go_year='2022
    @Select("select tname as tec ,cname as sub,address as addr ,date ,weekday ,odate from courses where sno=#{sno} and go_year=#{year} and go_month=#{xq}")
    List<Courses> selectCourse(@Param ("sno") String sno, @Param("year") String year, @Param("xq") String xq);
}
