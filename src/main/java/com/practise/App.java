package com.practise;

import java.util.Arrays;
import java.util.List;

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
//        s.setId(15);
//        s.setfName("Swara");
//        s.setlName("Wange");
//        s.setMobileNo(980115);
//        s.setCity("Yavtmal");
//        s.setGender("Female");
        
        student s1 = new student();
        s1.setId(16);
        s1.setfName("Shivani");
        s1.setlName("Pote");
        s1.setMobileNo(986711);
        s1.setCity("Akola");
        s1.setGender("Female");
        
        student s2 = new student();
        s2.setId(17);
        s2.setfName("Saloni");
        s2.setlName("Deshmukh");
        s2.setMobileNo(980011);
        s2.setCity("Digras");
        s2.setGender("Female");
        
        List<student> studentList = Arrays.asList(s1, s2);
        
        
        //1. session factory
        SessionFactory factory = HibernateUtility.getSessionFactory();
        
        //2. session from session factory
        Session session = factory.openSession();
        
        //3. Transaction from session
        //Transaction transaction = session.beginTransaction();
        
//        //4. save process
//        session.persist(s);
//        
//        //5. pass to database
//        transaction.commit();
        
        
        //to save list of student
        for(student stu : studentList) {
        	Transaction transaction = session.beginTransaction();
        	session.persist(stu);
        	transaction.commit();
        }
        //6. session closed
        session.close();
    }
}
