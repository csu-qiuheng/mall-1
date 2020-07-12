package com.boss.mall.mapper;

import com.boss.mall.entity.Order;
import com.boss.mall.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    int addOrder(Order order);

    public List<Order> listOrder();


}
