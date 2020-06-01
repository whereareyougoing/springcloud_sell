package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;

/**
 * @作者 宋寒冬
 * @日期 2020-03-15
 * @时间 02:03
 * @描述
 */
public class OrderException extends RuntimeException {

    private int code;

    public OrderException(int code,String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
