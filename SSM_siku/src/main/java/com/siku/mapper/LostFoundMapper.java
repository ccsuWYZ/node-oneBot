package com.siku.mapper;

import com.siku.pojo.LostFound;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author lee
 * @date 2022-11-24 15:41:05
 * @description
 */
@Mapper
public interface LostFoundMapper {
    @Select("select * from publost")
    public List<LostFound> getLostFoundList();

    @Insert("insert into publost (sno,type,connect,img,content,avatar,nickname,pubtime) values (#{sno},#{type},#{connect},#{img}," +
            "#{content},#{avatar},#{nickname},#{pubtime})")
    public int PubLostFound(LostFound lostFound);

    @Delete("DELETE FROM publost WHERE id = #{id}")
    public int delLostFound(@Param("id") int id);

    @Update("update publost set status=not status where id=#{id}")
    public int updateStatus(@Param("id") int id);
}
