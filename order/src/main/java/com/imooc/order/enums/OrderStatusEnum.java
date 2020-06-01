package com.imooc.order.enums;

import lombok.Getter;

/**
 * @作者 宋寒冬
 * @日期 2020-03-15
 * @时间 00:35
 * @描述
 */

@Getter
public enum OrderStatusEnum {

    NEW(0,"新订单"),
    CANCEL(1,"取消"),
    FINISHED(2,"完结"),
    ;

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
