package com.soft1851.springbootsaop.service;

import com.soft1851.springbootsaop.entity.User;

/**
 * @author jh_wu
 * @ClassName UserService
 * @Description TODO
 * @Date 2020/4/13:20:34
 * @Version 1.0
 **/
public interface UserService {
    /**
     * 用户登录
     *
     * @param name
     * @return User
     */
    User userLogin(String name);
}
