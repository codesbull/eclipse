package com.belief.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();

	// ʹ�þ�̬������ʼ��Hibernate
	static {
		try {
			// 1 ��ȡ�����ļ�
			Configuration cfg = new Configuration().configure();
			// 2 �������� ����Factory
			sessionFactory = cfg.buildSessionFactory();
			cfg = null;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// ���SessionFactoryʵ��
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	// ���ThreadLocal��������Sessionʵ��
	public static Session getSession() throws HibernateException {
		Session session = (Session) threadLocal.get();
		if (session == null || !session.isOpen()) {
			if (sessionFactory == null) {
				rebuildSessionFactory();
			}
			// 3 ͨ��sessionFactory��ò������ݿ��session����
			session = (sessionFactory != null) ? sessionFactory.openSession() : null;
			threadLocal.set(session);
		}
		return session;
	}

	public static void closeSession() throws HibernateException {
		// ���ֲ߳̾�����threadLocal�л�ȡ֮ǰ�����Sessionʵ��
		Session session = (Session) threadLocal.get();
		threadLocal.set(null);
		if (session != null) {
			session.close();
		}
	}

	// �ؽ�SessionFactory
	public static void rebuildSessionFactory() {
		try {
			Configuration cfg = new Configuration().configure();
			sessionFactory = cfg.buildSessionFactory();
			cfg = null;
		} catch (Exception ex) {
			System.out.println("Error Creating SessionFactory");
			ex.printStackTrace();
		}
	}

	public static void shutDown() {
		getSessionFactory().close();
	}

}