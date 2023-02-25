package com.siku.mapper;


import com.siku.pojo.Tiku;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TikuMapper {

    @Select("select * from question_bank")
    List<Tiku> selectTiku();

    @Select("select bank_id from question_bank")
    List<String> selectBankid();
}
