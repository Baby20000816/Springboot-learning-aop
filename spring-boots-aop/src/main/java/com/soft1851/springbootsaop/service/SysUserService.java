package com.soft1851.springbootsaop.service;

import java.util.Map;

/**
 * @author jh_wu
 * @ClassName SysUserService
 * @Description TODO
 * @Date 2020/4/14
 * @Version 1.0
 **/
public interface SysUserService {
    /**
     * 用户登录
     * @param id
     * @param password
     * @return
     */
    Map<String,Object> signIn(String id, String password);

}
