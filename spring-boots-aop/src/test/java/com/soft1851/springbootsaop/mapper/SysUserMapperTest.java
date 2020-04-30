package com.soft1851.springbootsaop.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @Author wf
 * @Date 2020/4/13
 * @Version 1.0
 */
@SpringBootTest
class SysUserMapperTest {
    @Resource
    private SysUserMapper mapper;

    @Test
    void getUserById() {
        System.out.println(mapper.getUserById("1"));
    }
}