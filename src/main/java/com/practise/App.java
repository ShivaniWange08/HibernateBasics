package com.practise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.student;
import com.practise.utility.HibernateUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        student s = new student();
        s.setId(10);
        s.setfName("Shubhada");
        s.setlName("Murhekar");
        s.setMobileNo(986745);
        s.setCity("Chandur");
        s.setGender("Female");
        
        
        //1. session factory
        SessionFactory factory = HibernateUtility.getSessionFactory();
        
        //2. session from session factory
        Session session = factory.openSession();
        
        //3. Transaction from session
        Transaction transaction = session.beginTransaction();
        
        //4. save process
        session.persist(s);
        
        //5. pass to database
        transaction.commit();
        
        //6. session closed
        session.close();
    }
}
