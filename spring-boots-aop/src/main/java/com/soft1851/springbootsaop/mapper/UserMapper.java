package com.soft1851.springbootsaop.mapper;

import com.soft1851.springbootsaop.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author jh_wu
 * @ClassName UserMapper
 * @Description TODO
 * @Date 2020/4/13
 * @Version 1.0
 **/
public interface UserMapper {

    /**
     * 用户登录
     *
     * @param id
     * @return User
     */
    @Select("SELECT * FROM t_student WHERE id = #{id}  ")
    User userLogin(String id);
}
