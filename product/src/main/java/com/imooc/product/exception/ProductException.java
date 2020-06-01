package com.imooc.product.exception;

import com.imooc.product.enums.ResultEnum;

/**
 * @作者 宋寒冬
 * @日期 2020-03-16
 * @时间 09:13
 * @描述
 */
public class ProductException extends RuntimeException {



    private Integer code;

    public ProductException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
