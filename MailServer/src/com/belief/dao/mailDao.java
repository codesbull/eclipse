package com.belief.dao;

import java.util.ArrayList;

import com.belief.model.Mail;

//�־ò����ӿ�
public interface mailDao {
	void save(Mail mail);

	void delete(Mail mail);

	void update(Mail mail);

	Mail QueryByMailId(String mail_id);
	
	ArrayList <Mail> QueryByMailAddress(String mail_address);
	
	ArrayList <Mail> QueryByMailReceive(String mail_receive);
	
}