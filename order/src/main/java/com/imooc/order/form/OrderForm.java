package com.imooc.order.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @作者 宋寒冬
 * @日期 2020-03-15
 * @时间 01:58
 * @描述
 */
@Data
public class OrderForm {

    @NotEmpty(message = "名称必填")
    private String name;
    @NotEmpty(message = "电话必填")
    private String phone;
    @NotEmpty(message = "地址必填")
    private String address;
    @NotEmpty(message = "openid必填")
    private String openid;
    @NotEmpty(message = "购物车不能为空")
    private String items;

}
