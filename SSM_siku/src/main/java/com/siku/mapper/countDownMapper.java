package com.siku.mapper;


import com.siku.pojo.SelfCountDown;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface countDownMapper {

    @Insert("INSERT INTO selfcountdown (sno,countDownName,endTime)  values (#{sno},#{countDownName},#{endTime})")
    public int addCountDown(SelfCountDown selfCountDown);

    @Select("select * from selfcountdown where sno=#{sno}")
    public List<SelfCountDown> getCountDown(String sno);

    @Delete("delete   from selfcountdown where sno=#{sno} and countDownId=#{countDownId} ")
    public int delCountDown(SelfCountDown selfCountDown);
}
