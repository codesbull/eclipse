package com.belief.dao;

import com.belief.model.Admin;

//�־ò����ӿ�
public interface adminDao {
	void save(Admin admin);

	void delete(Admin admin);

	void update(Admin admin);

	Admin QueryByAccount(String account);
}