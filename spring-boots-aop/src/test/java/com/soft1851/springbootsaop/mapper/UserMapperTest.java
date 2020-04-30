package com.soft1851.springbootsaop.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserMapperTest {
    @Resource
private UserMapper userMapper;
    @Test
    void userLogin() {
        System.out.println(userMapper.userLogin("1"));
    }
}