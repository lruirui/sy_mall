package com.lsy.mall.entity;

import lombok.Data;

import java.util.Date;

/**
 * .
 *
 * @author lsy
 * @create 2018-11-23 17:13
 */
@Data
public class ShopCategory {

    private long shopCategoryId;

    private String shopCategoryName;

    private String shopCategoryDesc;

    private String shopCategoryImg;

    private Integer priority;

    private Date createTime;

    private Date lastEditTime;

    private ShopCategory parent;
}
