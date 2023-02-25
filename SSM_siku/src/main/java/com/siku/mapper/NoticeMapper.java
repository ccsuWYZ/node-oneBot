package com.siku.mapper;

import com.siku.pojo.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author lee
 * @date 2022-11-24 14:15:06
 * @description
 */
@Mapper
public interface NoticeMapper {
    @Select("SELECT * from notices")
    public Notice getNotice();
}
