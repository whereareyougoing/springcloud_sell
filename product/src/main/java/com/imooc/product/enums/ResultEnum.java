package com.imooc.product.enums;

import lombok.Getter;

/**
 * @作者 宋寒冬
 * @日期 2020-03-16
 * @时间 09:14
 * @描述
 */

@Getter
public enum  ResultEnum {

    PRODUCT_NOT_EXIT(1, "商品不存在"),
    PRODUCT_STOCK_ERROR(1,"库存有误"),
    ;


    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
