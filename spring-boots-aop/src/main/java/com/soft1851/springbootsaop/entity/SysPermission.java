package com.soft1851.springbootsaop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (SysPermission)实体类
 *
 * @author makejava
 * @since 2020-04-14 09:56:30
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SysPermission implements Serializable {
    private static final long serialVersionUID = 767900137736881395L;
    /**
    * 权限id
    */
    private Integer pId;
    /**
    * 父类id
    */
    private Integer parentId;
    /**
    * 权限名称
    */
    private String pName;
    /**
    * 类型
    */
    private Integer type;
    /**
    * 图标
    */
    private String icon;
    /**
    * 地址
    */
    private String path;
    /**
    * 扩展字段1
    */
    private String ex1;
    /**
    * 扩展字段2
    */
    private Integer ex2;


}