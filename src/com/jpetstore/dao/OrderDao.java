package com.jpetstore.dao;

import java.util.List;

import com.jpetstore.domain.Order;

public interface OrderDao {

	List<Order> findAll(); //��ѯ���ж�����Ϣ
	
	Order findById(int  orderid); //����������ѯ������Ϣ
	
	int create(Order order); //����������Ϣ
	
	int modify(Order order); //�޸Ķ�����Ϣ
	
	int remove(Order order); //ɾ��������Ϣ
	
	
}
