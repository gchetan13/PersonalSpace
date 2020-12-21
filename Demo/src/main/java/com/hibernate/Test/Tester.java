package com.hibernate.Test;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.models.Alien;
import com.hibernate.models.Laptop;
import com.hibernate.models.Student;

public class Tester {

	public static void main(String[] args) {
		Alien alien = new Alien();
		alien.setColor("White");
		alien.setId(105);
		alien.setName("Surabhi");
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session= sessionFactory.openSession();
		
		//session.save(alien);
	//	transaction.commit();
		Student student = new Student();
		Laptop laptop = new Laptop();
		laptop.setlId(136);
		laptop.setlName("HP");
	//	laptop.setStudent(student);

		Laptop laptop1 = new Laptop();
		laptop1.setlId(135);
		laptop1.setlName("Lenovo");
		
	//	laptop1.setStudent(student);
		
		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(laptop);
		laptops.add(laptop1);
		student.setRollNo(58);
		student.setName("Jagat");
		student.setMarks(73);
		laptop.setStudent(student);
		//student.setLaptop(laptop1);
		//transaction.begin();
		
		Query<Alien> query = session.createQuery("from Alien where id=101");	
		query.setCacheable(true);
		Alien alien4 = query.uniqueResult();
		
		Transaction transaction = session.beginTransaction();
		//	Alien alien2 = (Alien)session.get(Alien.class, 101);
			System.out.println(alien4);
		//	System.out.println("alien4 getIdentifier "+session.getIdentifier(alien4));
			//	System.out.println(alien2);
			System.out.println(session.getStatistics());
			transaction.commit();
			//	session.evict(alien2);
			session.close();
			
			Session session2 = sessionFactory.openSession();
			Transaction transaction2 = session2.beginTransaction();
	//		Alien alien3 = (Alien)session2.get(Alien.class, 105);
		//	System.out.println(alien3);
			
			
			Query<Alien> query2 = session2.createQuery("from Alien where id=101");		
			query2.setCacheable(true);
			Alien alien5 = query2.uniqueResult();
			session2.setReadOnly(alien5, false);
			System.out.println("isReadONly "+session2.isReadOnly(alien5));
	//	session.save(laptop);
	//	session.save(laptop);
	//	session.save(student);
	//	session.save(laptop);
	//	session.save(laptop1);
		
		alien5.setColor("white");
	 	session2.update(alien5);	
	 	System.out.println("merged "+alien5);
		transaction2.commit();

	//	session2.close();
/*		Session session3 = sessionFactory.openSession();
		Transaction transaction3 = session3.getTransaction();
		transaction3.begin();
		//	Alien alien6 = session3.get(Alien.class, 105);
		//alien5.setColor("Grey");
		session3.saveOrUpdate(alien5);
		transaction3.commit();
		session3.close();*/
		System.out.println("statistics");
	
		sessionFactory.close();
	}

}
