package com.soft1851.springbootmybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jh_wu
 * @since 2020-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_role")
public class SysRole extends Model<SysRole> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
    @TableId("role_id")
    private Integer roleId;

    /**
     * 角色名
     */
    @TableField("role_name")
    private String roleName;

    /**
     * 描述
     */
    @TableField("description")
    private String description;


    @Override
    protected Serializable pkVal() {
        return this.roleId;
    }

}
