package com.jpetstore.dao;

import java.util.List;

import com.jpetstore.domain.Account;

public interface AccountDao {
	
	List<Account> findAll(); //��ѯ�����û���Ϣ
	
	Account findById(String userid); //����������ѯ�û���Ϣ
	
	int create(Account account); //�����û���Ϣ
	
	int modify(Account account); //�޸��û���Ϣ
	
	int remove(Account account); //ɾ���û���Ϣ
	
	

}
