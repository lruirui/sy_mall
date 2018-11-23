package com.lsy.mall.entity;

import lombok.Data;

import java.io.PipedReader;
import java.util.Date;

/**
 * .
 *
 * @author lsy
 * @create 2018-11-23 17:34
 */

@Data
public class ProductImg {

    private Long productImgId;

    private String imgAddr;

    private String imgDesc;

    private Integer priority;

    private Date createTime;

    private Long productId;
}
