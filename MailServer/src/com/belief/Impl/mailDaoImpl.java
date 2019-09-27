package com.belief.Impl;

import java.util.ArrayList;

import com.belief.dao.mailDao;
import com.belief.model.Mail;

//持久层(DAO层)的实现类，继承了持久层公共父类，并实现了持久层抽象接口
public class mailDaoImpl extends ImplFather implements mailDao {

	@Override
	public void save(Mail mail) {
		session.save(mail);
		cleanUp();
	}

	@Override
	public void delete(Mail mail) {
		session.delete(mail);
		cleanUp();
	}

	@Override
	public void update(Mail mail) {
		session.update(mail);
		cleanUp();
	}

	@Override
	public Mail QueryByMailId(String mail_id) {
		Mail mail = (Mail) session.get(Mail.class, mail_id);
		cleanUp();
		return mail;
	}

	@Override
	public ArrayList<Mail> QueryByMailAddress(String mail_address) {
		String hql = "SELECT * FROM mail_entity WHERE mail_address=?";
		@SuppressWarnings("unchecked")
		ArrayList<Mail> mails = (ArrayList<Mail>) session.createQuery(hql).setParameter("mail_address", mail_address)
				.getResultList();
		cleanUp();
		return mails;
	}

	@Override
	public ArrayList<Mail> QueryByMailReceive(String mail_receive) {
		String hql = "SELECT * FROM mail_entity WHERE mail_receive=?";
		@SuppressWarnings("unchecked")
		ArrayList<Mail> mails = (ArrayList<Mail>) session.createQuery(hql).setParameter("mail_receive", mail_receive)
				.getResultList();
		cleanUp();
		return mails;
	}

}
