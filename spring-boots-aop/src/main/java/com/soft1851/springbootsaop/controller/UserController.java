package com.soft1851.springbootsaop.controller;

/**
 * @author jh_wu
 * @ClassName UserController
 * @Description TODO
 * @Date 2020/4/13:15:21
 * @Version 1.0
 **/

import com.soft1851.springbootsaop.annotation.AuthToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(value = "/api")
public class UserController {
    @GetMapping("hello")
    public String hello(String name){
        log.info("hello()方法无需鉴权，无需认证,用户名"+name);
        return "hello方法访问成功";
    }

    /**
     * 需要认证,此时该方法需要加注解，但是不需要传角色
     * @param name
     * @return
     */
    @GetMapping("user")
    @AuthToken
    public  String user(String name){
        log.info("user()方法需认证,用户名"+name);
        return "user()方法访问成功";
    }

    /**
     * 需要鉴权,此时该方法需要加注解，但是需要传角色
     * 角色可以传多个
     * 如果需要更复杂的逻辑操作。建议使用spring Security\apache shiro等安全框架
     * @param name
     * @return
     */
    @GetMapping("admin")
    @AuthToken(role_name = {"admin","Admin"})
    public String admin(String name){
        log.info("admin()方法需鉴权,用户名"+name);
        return  "admin()方法访问成功";
    }
}
