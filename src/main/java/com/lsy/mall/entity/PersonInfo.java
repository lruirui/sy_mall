package com.lsy.mall.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * .
 *
 * @author lsy
 * @create 2018-11-23 16:41
 */
@Data
@ToString
public class PersonInfo {
    /** 用户ID*/
    private Long userId;

    /** 用户姓名*/
    private String name;

    /** 头像*/
    private String profileImg;

    /** 用户邮箱*/
    private String email;

    /** 用户性别*/
    private String gender;

    /** 用户生日*/
    private Date birthday;

    /** 用户状态*/
    private Integer enableStatus;

    /** 用户类型
     * 1.顾客 2.店家 3.超级管理员
     * */
    private Integer userType;

    /** 创建时间*/
    private Date createTime;

    /** 修改事件*/
    private Date lastEditTime;

}
