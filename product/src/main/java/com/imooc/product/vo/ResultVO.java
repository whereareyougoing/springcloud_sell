package com.imooc.product.vo;

import lombok.Data;

/**
 * @作者 宋艾衡
 * @日期 2020-03-10
 * @时间 17:54
 * @描述
 */

@Data
public class ResultVO<T> {


    private Integer code;
    private String msg;
    private T data;

    public ResultVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultVO(T data) {
        this.code = 0;
        this.msg = "成功";
        this.data = data;
    }

}
