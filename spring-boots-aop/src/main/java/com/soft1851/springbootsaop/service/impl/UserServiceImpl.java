package com.soft1851.springbootsaop.service.impl;

import com.soft1851.springbootsaop.entity.User;
import com.soft1851.springbootsaop.mapper.UserMapper;
import com.soft1851.springbootsaop.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author jh_wu
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Date 2020/4/13:20:34
 * @Version 1.0
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User userLogin(String name) {
        return userMapper.userLogin(name) ;
    }
}
