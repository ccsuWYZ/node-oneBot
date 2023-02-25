package com.siku.mapper;


import com.siku.pojo.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {

    @Select("select * from test where sno=#{sno}")
    List<Test> selectTest(@Param("sno") String sno);
}
