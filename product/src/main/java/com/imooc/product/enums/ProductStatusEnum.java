package com.imooc.product.enums;

import lombok.Getter;

/**
 * @作者 宋艾衡
 * @日期 2020-03-10
 * @时间 17:43
 * @描述
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
