package com.siku.mapper;

import com.siku.pojo.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("select * from users where openId=#{openId}")
    public User getUserByid(@Param("openId") String openId);
    @Insert("insert into users(nickname,openId) values (#{nickname},#{openId})")
    public int addUser(@Param("nickname") String name,@Param("openId") String openId);

    @Update("update users set sno=#{sno},isww=#{isww} where openId=#{openId} ")
    public int bindSno (@Param("sno") String sno, @Param("isww") String isww, @Param("openId") String openId);

    @Select("select * from users where openId=#{openId}")
    public User user(@Param("openId") String openId);

    @Update("update users set qqnumber=#{qq} where openId=#{openId} ")
    public int updateQQ(@Param("qq") String qq,@Param("openId") String openId);

    @Select("select qqnumber from users where openId=#{openId}")
    public String getQQbyId(@Param("openId") String openId);

    @Select("SELECT qq FROM addqq WHERE qq=#{qq}")
    public String getQQ(@Param("qq") String qq);
}
