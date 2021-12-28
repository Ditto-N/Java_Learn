package com.jpetstore.dao;

import java.util.List;

import com.jpetstore.domain.Account;

public interface AccountDao {
	
	List<Account> findAll(); //查询所有用户信息
	
	Account findById(String userid); //根据主键查询用户信息
	
	int create(Account account); //创建用户信息
	
	int modify(Account account); //修改用户信息
	
	int remove(Account account); //删除用户信息
	
	

}
