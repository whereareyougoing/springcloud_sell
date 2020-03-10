package com.imooc.product.service;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @作者 宋艾衡
 * @日期 2020-03-10
 * @时间 17:46
 * @描述
 */
@Component
public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;


    @Test
    public void findUpAll() {

        List<ProductInfo> list = productService.findUpAll();
        assertTrue(list.size() > 0);


    }
}