package com.hibernate.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Version;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//Session session= sessionFactory.openSession();
		//System.out.println(Version.getVersionString());
		sessionFactory.getCurrentSession();
	}

}
