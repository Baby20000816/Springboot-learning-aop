package com.soft1851.springbootsaop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (UserRole)实体类
 *
 * @author makejava
 * @since 2020-04-14 09:57:08
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserRole implements Serializable {
    private static final long serialVersionUID = -97462262598895585L;
    /**
    * id
    */
    private Integer id;
    /**
    * 用户id
    */
    private String userId;
    /**
    * 角色id
    */
    private Integer roleId;

}