package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @作者 宋艾衡
 * @日期 2020-03-10
 * @时间 15:46
 * @描述
 */

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {


    List<ProductInfo> findByProductStatus(Integer productStatus);



}
