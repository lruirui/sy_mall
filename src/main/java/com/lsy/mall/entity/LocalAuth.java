package com.lsy.mall.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * .
 *
 * @author lsy
 * @create 2018-11-23 16:57
 * 本地账号
 */
@Data
@ToString
public class LocalAuth {

    private Long localAuthId;

    private String username;

    private String password;

    private Date createTime;

    private Date lastEditTime;

    private PersonInfo personInfo;
}
