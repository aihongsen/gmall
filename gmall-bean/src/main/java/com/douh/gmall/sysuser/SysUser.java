package com.douh.gmall.sysuser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sysuser implements Serializable {
    /**
     * 用户标识
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 昵称
     */
    private String nikeName;

    /**
     * 密码
     */
    private String passwd;

    /**
     * 3:管理员 4:子帐号
     */
    private String userType;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 角色名
     */
    private String realName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 登录个数
     */
    private Integer loginnum;

    /**
     * 登录时间
     */
    private Date logintime;

    /**
     * 登录ID
     */
    private String loginip;

    /**
     * 状态
     */
    private String state;

    /**
     * 组织ID
     */
    private String orgId;

    /**
     * 管理员基本
     */
    private String grade;

    /**
     * 隶属那个管理员
     */
    private Integer subjection;

    /**
     * 逻辑删除
     */
    private String isDel;
}
