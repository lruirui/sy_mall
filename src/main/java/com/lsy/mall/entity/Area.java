package com.lsy.mall.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * .
 *
 * @author lsy
 * @create 2018-11-23 16:27
 */
@Data
@ToString
public class Area {

    /** id*/
    private Integer areaId;

    /** 区域名*/
    private String areaName;

    /** 区域描述*/
    private String areaDesc;

    /** 权重*/
    private Integer priority;

    /** 创建时间*/
    private Date createTime;

    /** 更新时间*/
    private Date lastEditTime;
}
