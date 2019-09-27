package com.belief.Impl;

import com.belief.dao.adminDao;
import com.belief.model.Admin;

//�־ò�(DAO��)��ʵ���࣬�̳��˳־ò㹫�����࣬��ʵ���˳־ò����ӿ�
public class adminDaoImpl extends ImplFather implements adminDao {

	@Override
	public void save(Admin admin) {
		session.save(admin);
		cleanUp();
	}

	@Override
	public void delete(Admin admin) {
		session.delete(admin);
		cleanUp();
	}

	@Override
	public void update(Admin admin) {
		session.update(admin);
		cleanUp();
	}

	@Override
	public Admin QueryByAccount(String account) {
		Admin admin = (Admin) session.get(Admin.class, account);
		cleanUp();
		return admin;
	}

}
