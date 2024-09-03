package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads(){

    }

    @Test
    public void testGetAllUser() {
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user.email + "、" + user.phone);
        }
    }

    @Test
    public void testSQLConnection() {

    }
}