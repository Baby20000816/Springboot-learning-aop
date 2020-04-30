package com.soft1851.springbootsaop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (RolePermission)实体类
 *
 * @author makejava
 * @since 2020-04-14 09:57:18
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RolePermission implements Serializable {
    private static final long serialVersionUID = -74880400995541968L;
    /**
    * id
    */
    private Integer id;
    /**
    * 角色id
    */
    private Integer roleId;
    /**
    * 权限id
    */
    private Integer permissionId;




}