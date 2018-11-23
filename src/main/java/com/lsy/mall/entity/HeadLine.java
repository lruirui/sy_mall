package com.lsy.mall.entity;

import lombok.Data;

import java.util.Date;

/**
 * .
 *
 * @author lsy
 * @create 2018-11-23 17:07
 */
@Data
public class HeadLine {

    private Long lineId;

    private String lineName;

    private String lineLink;

    private String lineImg;

    private Integer priority;

    /**
     * 0不可用 1可用
     * */
    private Integer enableStatus;

    private Date createTime;

    private Date lastEditTime;
}
