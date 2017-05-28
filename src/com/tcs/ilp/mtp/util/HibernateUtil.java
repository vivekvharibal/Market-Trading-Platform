package com.tcs.ilp.mtp.util;

import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

	private static final ThreadLocal<Session> session;
	private static final Configuration config;
	private static final SessionFactory sessionFactory ;
	static{

		session = new ThreadLocal<Session>();
		config = new Configuration();
		sessionFactory =config.configure().buildSessionFactory();
	}

	protected HibernateUtil() {

		//constructor
	}

	public static Session getSession() throws Exception {//static function to open a session in DAO

		Session session =  (Session)HibernateUtil.session.get();//	Creates and initializes the copy if this is the first time the thread has called this method
		if (session == null) {							
			session = sessionFactory.openSession();
			HibernateUtil.session.set(session);
		}
		return session;
	}

	protected void begin() throws Exception {
		getSession().beginTransaction();//call to begin transaction
	}

	protected void commit() throws Exception {
		getSession().getTransaction().commit();
	}

	protected void rollback() throws Exception {

		getSession().getTransaction().rollback();

		getSession().close();

		HibernateUtil.session.set(null);
	}

	public static void close() throws Exception {
		getSession().close();
		HibernateUtil.session.set(null);
	}
}