package com.belief.dao;

import java.util.ArrayList;

import com.belief.model.User;

//�־ò����ӿ�
public interface userDao {
	void save(User user);

	void delete(User user);

	void update(User user);

	User QueryByEmail(String email);
	
	ArrayList <User> QueryAllUser();
	
}