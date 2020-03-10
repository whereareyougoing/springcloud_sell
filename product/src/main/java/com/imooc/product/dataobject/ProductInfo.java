package com.imooc.product.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @作者 宋艾衡
 * @日期 2020-03-10
 * @时间 02:09
 * @描述
 */

@Table(name = "product_info")
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    private Integer productStatus;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;


}
