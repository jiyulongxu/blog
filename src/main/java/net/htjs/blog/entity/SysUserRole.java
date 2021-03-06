package net.htjs.blog.entity;

import lombok.Getter;
import lombok.Setter;
/**
 * blog/net.htjs.blog.entity
 *
 * @Description:
 * @Author: dingdongliang
 * @Date: 2018/8/13 17:35
 */
@Getter
@Setter
public class SysUserRole extends BaseDomain {
    private String urId;

    private String roleId;

    private String userId;

    private String status = "E";

}