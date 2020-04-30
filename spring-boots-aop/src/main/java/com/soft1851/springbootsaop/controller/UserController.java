package com.soft1851.springbootsaop.controller;

/**
 * @author jh_wu
 * @ClassName UserController
 * @Description TODO
 * @Date 2020/4/13:15:21
 * @Version 1.0
 **/

import com.soft1851.springbootsaop.annotation.AuthToken;
import com.soft1851.springbootsaop.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping(value = "/api")
public class UserController {
    @Resource
    private UserMapper userMapper;
    /**
     * 无需任何校验，不用加注解
     * @param name
     * @return
     */
    @GetMapping("hello")
    public String hello(String name){
        log.info("hello()方法无需鉴权，也无需认证,当前用户名：" + name);
        return "hello方法访问成功";
    }

    /**
     * 需要认证，此时该方法需要加注解，但是不需要传角色
     * @param id
     * @return
     */
    @GetMapping("user")
    @AuthToken
    public String user(String id){
        String name = userMapper.userLogin(id).getName();
        log.info("user()方法需要认证，当前用户名：" + name);
        return "user()方法访问成功";
    }

    /**
     * 需要鉴权，此时该方法需要加注解，需要传角色
     * 角色可以传多个
     * 如果需要更复杂的逻辑操作，建议使用Spring Security、Apache Shiro等安全框架
     * @param id
     * @return
     */
    @GetMapping("admin")
    @AuthToken(role_name = {"admin","Admin"})
    public String admin(String id){
        String name = userMapper.userLogin(id).getName();
        log.info("admin()方法无需鉴权，当前用户名：" + name);
        return "admin()方法访问成功";
    }


}
