package com.soft1851.springbootsaop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (SysRole)实体类
 *
 * @author makejava
 * @since 2020-04-14 09:56:51
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SysRole implements Serializable {
    private static final long serialVersionUID = 363822917371637859L;
    /**
    * 角色id
    */
    private Integer roleId;
    /**
    * 角色名
    */
    private String roleName;
    /**
    * 描述
    */
    private String description;


}