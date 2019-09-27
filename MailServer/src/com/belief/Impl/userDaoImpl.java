package com.belief.Impl;

import java.util.ArrayList;

import com.belief.dao.userDao;
import com.belief.model.User;

//持久层(DAO层)的实现类，继承了持久层公共父类，并实现了持久层抽象接口
public class userDaoImpl extends ImplFather implements userDao {

	@Override
	public void save(User user) {
		session.save(user);
		cleanUp();
	}

	@Override
	public void delete(User user) {
		session.delete(user);
		cleanUp();
	}

	@Override
	public void update(User user) {
		session.update(user);
		cleanUp();
	}

	@Override
	public User QueryByEmail(String email) {
		User user = (User) session.get(User.class, email);
		cleanUp();
		return user;
	}

	@Override
	public ArrayList<User> QueryAllUser() {
		String hql = "SELECT * FROM user_entity";
		@SuppressWarnings("unchecked")
		ArrayList<User> users = (ArrayList<User>) session.createQuery(hql).getResultList();
		cleanUp();
		return users;
	}

}
