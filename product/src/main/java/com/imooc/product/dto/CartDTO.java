package com.imooc.product.dto;

import lombok.Data;

/**
 * @作者 宋寒冬
 * @日期 2020-03-15
 * @时间 23:32
 * @描述
 */

@Data
public class CartDTO {

    private String productId;
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
