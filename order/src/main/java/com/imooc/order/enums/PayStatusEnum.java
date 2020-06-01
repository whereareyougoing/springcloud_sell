package com.imooc.order.enums;

import lombok.Getter;

/**
 * @作者 宋寒冬
 * @日期 2020-03-15
 * @时间 00:38
 * @描述
 */

@Getter
public enum PayStatusEnum {

    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
