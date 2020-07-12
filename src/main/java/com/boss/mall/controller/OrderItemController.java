package com.boss.mall.controller;

import com.boss.mall.entity.Order;
import com.boss.mall.entity.OrderItem;
import com.boss.mall.entity.Product;
import com.boss.mall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//若不加返回路径，加了返回函数类型
@RequestMapping(value = "/OrderItem", method = { RequestMethod.GET, RequestMethod.POST },produces = "application/json; charset=utf-8")
public class OrderItemController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/listOrderItem",method = RequestMethod.GET)
    public List<OrderItem> listOrderItem(){
        return  orderService.listOrderItem();
    }

}
