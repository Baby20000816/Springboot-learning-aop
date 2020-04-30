package com.soft1851.springbootsaop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2020-04-14 09:56:59
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SysUser implements Serializable {
    private static final long serialVersionUID = 688967194184319912L;
    /**
    *  用户id
    */
    private Integer userId;
    /**
    *  用户名
    */
    private String userName;
    /**
    * 密码
    */
    private String password;
    /**
    * 昵称
    */
    private String nickname;


}