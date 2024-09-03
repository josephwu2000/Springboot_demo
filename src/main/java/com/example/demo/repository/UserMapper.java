package com.example.demo.repository;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface UserMapper {


    public User UpdateUser(User user);

    @Select("SELECT *"+
            "  FROM user"+
            " WHERE ID = #{id}")
    public User getUserById(String id);

    // mybatis 註解方式來維護、管理SQL
    @Select(" SELECT " +
            "      ID, phone, email, create_time, update_time " +
            "   FROM " +
            "      user")
    public List<User> getUserList();
}