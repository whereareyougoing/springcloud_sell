package com.imooc.order.repository;

import com.imooc.order.OrderApplicationTests;
import com.imooc.order.dataobject.OrderMaster;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @作者 宋寒冬
 * @日期 2020-03-15
 * @时间 01:03
 * @描述
 */

@Component
public class OrderMasterRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void save(){

        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setBuyerAddress("123");
        orderMaster.setBuyerPhone("123");
        orderMaster.setBuyerOpenid("123");
        orderMaster.setOrderAmount(new BigDecimal(1));
        orderMaster.setOrderId("123");
        orderMaster.setOrderStatus(1);
        orderMaster.setBuyerName("123");
        orderMaster.setPayStatus(1);

        OrderMaster master = orderMasterRepository.save(orderMaster);

        assertTrue(master != null);



    }

}