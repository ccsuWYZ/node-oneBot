package com.siku.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QqFriendsMapper {
    @Insert("insert IGNORE into  addqq (qq) values (#{qqNumber})")
    public int addQQfriend(@Param("qqNumber") String qqNumber);

    @Select("select DISTINCT sno from users where qqnumber =#{qqnumber} ")
    public Object getUserByQq(@Param("qqnumber") Object qqnumber);


    @Select("select qq from  addqq ")
    public List<Object> getAllQqNumber();
}
