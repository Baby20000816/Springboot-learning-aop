package com.soft1851.springbootsaop.service.impl;

import com.soft1851.springbootsaop.entity.SysUser;
import com.soft1851.springbootsaop.mapper.SysUserMapper;
import com.soft1851.springbootsaop.mapper.UserRoleMapper;
import com.soft1851.springbootsaop.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author jh_wu
 * @ClassName SysUserServiceImpl
 * @Description TODO
 * @Date 2020/4/14:10:00
 * @Version 1.0
 **/
@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper mapper;
    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public Map<String,Object> signIn(String id, String password) {
        SysUser user = mapper.signIn(id);
        Map<String,Object> map = null;
        if(user != null && user.getPassword().equals(password)){
            map = userRoleMapper.getUserRole(id);
            if(map != null) {
                return map;
            }
        }
        map.put("msg", "账号密码错误");
        return map;
    }
}
