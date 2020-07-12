package com.boss.mall.controller;

import com.boss.mall.entity.Order;
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
@RequestMapping(value = "/Order", method = { RequestMethod.GET, RequestMethod.POST },produces = "application/json; charset=utf-8")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/addOrder", method = RequestMethod.POST)
    public String addOrderToItem(int pid,int pnum)
    {
        return  orderService.insertProduct(1,pid,pnum);
    }

    @RequestMapping(value = "/listOrder",method = RequestMethod.GET)
    public List<Order> listOrder(){
        return  orderService.listOrder();
    }

}
