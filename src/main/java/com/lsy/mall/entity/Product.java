package com.lsy.mall.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * .
 *
 * @author lsy
 * @create 2018-11-23 17:39
 */
@Data
public class Product {

    private Long productId;

    private String productName;

    private String productDesc;

    //简略图
    private String imgAddr;

    private String normalPrice;

    private String promotionPrice;

    private Integer priority;

    private Date createTime;

    private Date lastEditTime;

    //-1.不可用,0.下架 1.在前端系统展示
    private Integer enableStatus;

    private List<ProductImg> productImgList;

    private ProductCategory productCategory;

    private Shop shop;
}
