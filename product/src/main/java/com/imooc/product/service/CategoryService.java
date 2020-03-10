package com.imooc.product.service;

import com.imooc.product.dataobject.ProductCategory;

import java.util.List;

/**
 * @作者 宋艾衡
 * @日期 2020-03-10
 * @时间 17:49
 * @描述
 */
public interface CategoryService {


    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);



}
