package com.qinchy.swaggerdemo.service;

import com.qinchy.swaggerdemo.model.Order;
import com.qinchy.swaggerdemo.model.OrderExample;

import java.util.List;

public interface OrderService {
    String add();
    List<Order> selectByExample(OrderExample orderExample);
}
