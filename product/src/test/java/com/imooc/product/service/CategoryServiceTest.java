package com.imooc.product.service;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @作者 宋艾衡
 * @日期 2020-03-10
 * @时间 17:52
 * @描述
 */

@Component
public class CategoryServiceTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;


    @Test
    public void findByCategoryTypeIn() {


        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(1, 2));
        assertTrue(list.size() > 0);

    }
}