package com.belief.test;

import org.junit.Test;

import com.belief.Impl.*;
import com.belief.model.User;

//½ö¹©²âÊÔ
public class TestUser {

	// ²âÊÔÔö
	@Test
	public void testSave() {
		userDaoImpl impl = new userDaoImpl();
		User iuser = new User();
		iuser.setMail_address("15514652@belief");
		iuser.setNick_name("ØıÑô");
		iuser.setUser_password("LYY1115*");
		impl.save(iuser);
	}

	// ²âÊÔ²é
	@Test
	public void testQuery() {
		userDaoImpl impl = new userDaoImpl();
		System.out.println(impl.QueryByEmail("795138462@belief"));
	}

	// ²âÊÔ¸Ä
	@Test
	public void testUpdate() {
		userDaoImpl impl = new userDaoImpl();
		User iuser = new User();
		iuser.setMail_address("15514652@belief");
		iuser.setNick_name("ÑôÑôÑôÑô");
		iuser.setUser_password("LYY1145*");
		impl.update(iuser);
	}

	// ²âÊÔÉ¾
	@Test
	public void testdelete() {
		userDaoImpl impl = new userDaoImpl();
		User iuser = new User();
		iuser.setMail_address("15514652@belief");
		impl.delete(iuser);
	}
}


