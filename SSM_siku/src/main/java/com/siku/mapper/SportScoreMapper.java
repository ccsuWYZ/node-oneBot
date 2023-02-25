package com.siku.mapper;

import com.siku.pojo.SportScore;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lee
 * @date 2022-11-17 23:43:55
 * @description
 */
@Mapper
public interface SportScoreMapper {
    @Select("select * from ty_scare where sno=#{sno} and ty_team=#{year}")
    public List<SportScore> getSportScoreByCondition(@Param("sno") String sno,@Param("year") String year);
}
