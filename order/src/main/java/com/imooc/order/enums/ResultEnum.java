package com.imooc.order.enums;

import lombok.Getter;

/**
 * @作者 宋寒冬
 * @日期 2020-03-15
 * @时间 02:08
 * @描述
 */
@Getter
public enum  ResultEnum {
    PARAM_ERROR(1,"参数错误"),
    CAR_EMPTY(2,"购物车为空")
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
