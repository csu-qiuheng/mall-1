package com.boss.mall.mapper;

import com.boss.mall.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderItemMapper {
    int addOrderItem(OrderItem orderItem);

    List<OrderItem> listOrderItem();
}
