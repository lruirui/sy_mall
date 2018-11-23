package com.lsy.mall.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * .
 *
 * @author lsy
 * @create 2018-11-23 16:55
 */
@Data
@ToString
public class WechatAuth {
    private Long wechatAuthId;

    private String openId;

    private Date createTime;

    private PersonInfo personInfo;
}
