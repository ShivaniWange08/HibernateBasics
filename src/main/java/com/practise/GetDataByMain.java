package com.practise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.student;
import com.practise.utility.HibernateUtility;

public class GetDataByMain {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		//deprecated method
		//student st = session.get(student.class, 2);
		
		//new method
		//these method are used to get data from database with id
		student st = session.find(student.class, 2);
		System.out.println(st.toString());
		transaction.commit();
		session.close();
	}
}
