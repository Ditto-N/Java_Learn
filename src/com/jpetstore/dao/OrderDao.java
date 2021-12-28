package com.jpetstore.dao;

import java.util.List;

import com.jpetstore.domain.Order;

public interface OrderDao {

	List<Order> findAll(); //查询所有订单信息
	
	Order findById(int  orderid); //根据主键查询订单信息
	
	int create(Order order); //创建订单信息
	
	int modify(Order order); //修改订单信息
	
	int remove(Order order); //删除订单信息
	
	
}
