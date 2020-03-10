package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @作者 宋艾衡
 * @日期 2020-03-10
 * @时间 15:49
 * @描述
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {


    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findByProductStatus() {

        List<ProductInfo> list = productInfoRepository.findByProductStatus(0);
        System.out.println(list.toString());
        assertTrue(list.size() > 0);

    }
}