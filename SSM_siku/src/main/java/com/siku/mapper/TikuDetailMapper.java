package com.siku.mapper;

import com.siku.pojo.TikuDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TikuDetailMapper {

    @Select("select * from question_detail where bank_id =#{bankId}")
    List<TikuDetail> selectAllByBankId(String bankId);

    @Select("select * from question_detail ")
    List<TikuDetail> selectAllDetail();
}
