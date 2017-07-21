package com.qinchy.swaggerdemo.controller;

import com.qinchy.swaggerdemo.model.OrderExample;
import com.qinchy.swaggerdemo.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by administrator on 17/7/4.
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "添加订单信息",notes = "无需参数")
    @RequestMapping(path="/add",method = RequestMethod.GET)
    public Object add() {
        return orderService.add();
    }

    @ApiOperation(value = "查询所有订单",notes = "无需参数")
    @RequestMapping(path="/queryAll",method = RequestMethod.GET)
    private Object queryAll() {
        OrderExample orderExample = new OrderExample();
        return orderService.selectByExample(orderExample);
    }
}
