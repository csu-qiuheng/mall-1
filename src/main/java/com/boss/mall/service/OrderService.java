package com.boss.mall.service;

import com.boss.mall.entity.Order;
import com.boss.mall.entity.OrderItem;
import com.boss.mall.entity.Product;
import com.boss.mall.mapper.OrderItemMapper;
import com.boss.mall.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Autowired
    OrderItemMapper orderItemMapper;

    public List<Order> listOrder(){
        return orderMapper.listOrder();
    }

    public List<OrderItem> listOrderItem(){
        return orderItemMapper.listOrderItem();
    }

    public String insertProduct(int userid,int pid,int pnum) {
        Order order = new Order();
        order.setUserid(userid);
        orderMapper.addOrder(order);


        OrderItem orderItem = new OrderItem();
        orderItem.setOrderid(order.getOrderid());
        orderItem.setPid(pid);
        orderItem.setPnum(pnum);
        orderItemMapper.addOrderItem(orderItem);
        if((orderItemMapper.addOrderItem(orderItem)) == -1)
        {
            return "error";
        }
        else
        {
            return "success";
        }
    }


}
