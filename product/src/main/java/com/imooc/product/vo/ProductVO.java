package com.imooc.product.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @作者 宋艾衡
 * @日期 2020-03-10
 * @时间 17:56
 * @描述
 */

@Data
public class ProductVO {


    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;
    @JsonProperty("goods")
    private List<ProductInfoVO> productInfoVOList;


}
