package com.imooc.order.repository;

import com.imooc.order.OrderApplicationTests;
import com.imooc.order.dataobject.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @作者 宋寒冬
 * @日期 2020-03-15
 * @时间 00:42
 * @描述
 */

@Component
public class OrderDetailRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void save(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setProductQuantity(1);
        orderDetail.setProductId("123");
        orderDetail.setOrderId("123");
        orderDetail.setDetailId("123");
        orderDetail.setProductIcon("123");
        orderDetail.setProductName("123");
        orderDetail.setProductPrice(new BigDecimal(1));

        OrderDetail detail = orderDetailRepository.save(orderDetail);

        assertTrue(detail != null);

    }


}