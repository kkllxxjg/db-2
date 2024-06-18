package com.mw.db.dao;

import com.mw.db.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> selectUserList();

    @Select("select * from user where id = #{id}")
    User selectUserById(int id);


}