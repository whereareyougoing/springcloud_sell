package com.imooc.order.vo;

import lombok.Data;

/**
 * @作者 宋寒冬
 * @日期 2020-03-15
 * @时间 02:25
 * @描述
 */

@Data
public class ResultVO<T> {

    private Integer code;
    private String msg;
    private T data;


}
