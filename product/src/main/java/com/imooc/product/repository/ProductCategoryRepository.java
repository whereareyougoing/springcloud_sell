package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @作者 宋艾衡
 * @日期 2020-03-10
 * @时间 16:14
 * @描述
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    /**
     *  jpa 格式的方法名，in 代表包含在其中
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);



}
