package com.siku.mapper;


import com.siku.pojo.Scores;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScoresMapper {

    //三者
    @Select("select * from scores where sno=#{sno} and go_year=#{year} and go_month=#{xq}")
    List<Scores> selectScores(@Param("sno") String sno, @Param("year") String year, @Param("xq") String xq);

}
