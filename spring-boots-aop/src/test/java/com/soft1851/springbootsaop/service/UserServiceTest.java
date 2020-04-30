package com.soft1851.springbootsaop.service;

import com.soft1851.springbootsaop.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserServiceTest {
    @Resource
    private UserMapper userMapper;
    @Test
    void userLogin() {
        System.out.println(userMapper.userLogin("1").getPassword());
        System.out.println(userMapper.userLogin("1").getRole());
        System.out.println(userMapper.userLogin("1").getName());
    }
}