package net.htjs.blog.dao;

import net.htjs.blog.entity.SysPermission;

import java.util.List;
/**
 * blog/net.htjs.blog.dao
 *
 * @Description: 权限表
 * @Author: dingdongliang
 * @Date: 2018/8/13 17:29
 */
public interface SysPermissionMapper extends BaseMapper<SysPermission> {
    /**
     * 根据用户ID查询其所拥有的所有权限
     *
     * @param userId 用户ID
     * @return java.util.List<net.htjs.blog.entity.SysPermission>
     * @author dingdongliang
     * @date 2018/4/18 15:44
     */
    List<SysPermission> getUserPmsn(String userId);
}