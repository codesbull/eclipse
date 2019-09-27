package com.belief.Impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.belief.util.HibernateUtil;

//��ȡ�־ò�(DAO��)�Ĺ������֣���Ϊ�־ò�ʵ����Ĺ�������
public class ImplFather {

	protected Session session = HibernateUtil.getSession();
	protected Transaction tx = session.beginTransaction();

	protected void cleanUp() {
		try {
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			HibernateUtil.closeSession();
		}
	}
}