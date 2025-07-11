package com.practise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.student;
import com.practise.utility.HibernateUtility;

public class UpdateData {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		student s = session.find(student.class, 9);
		s.setlName("Masal");
		
		transaction.commit();
		
		session.close();
		
		
		
	}
}
