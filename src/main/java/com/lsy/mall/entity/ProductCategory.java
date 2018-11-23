package com.lsy.mall.entity;

import lombok.Data;

import java.util.Date;

/**
 * .
 *
 * @author lsy
 * @create 2018-11-23 17:32
 */
@Data
public class ProductCategory {

    private Long productCategoryId;

    private Long shopId;

    private String productCategoryName;

    private Integer priority;

    private Date createTime;

}
