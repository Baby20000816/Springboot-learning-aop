package com.soft1851.springbootmybatisplus.mapper;

import com.soft1851.springbootmybatisplus.entity.SysPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jh_wu
 * @since 2020-04-16
 */
public interface SysPermissionMapper extends BaseMapper<SysPermission> {
    /**
     * 通过user_id查找该用户的权限
     * @param user_id
     * @return
     */
    List<SysPermission> selectPermissionByUserId (String user_id);
}
