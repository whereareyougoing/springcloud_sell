package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @作者 宋寒冬
 * @日期 2020-03-15
 * @时间 00:33
 * @描述
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
}
