package com.hiber.HibernatePractice2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        
    	Configuration config=new Configuration();
    	config.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory=config.buildSessionFactory();
    	
    	Session session= factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	Student s1=new Student(12,"Sam","Kolhapur","Singing");
    	
//    	session.save(s1);
//    	
//    	System.out.println("Details save sussesfully");
    	
    	Student s2= session.get(Student.class,9);
    	System.out.println(s2);
    	
    	Student s3=session.load(Student.class, 9);//use get also
    	
    	s3.setName("Adi");
    	s3.setHobby("Dancing");
    	session.update(s3);
    	System.out.println("update sussefully");
    	System.out.println(s3);
    	
    	Student s4= session.get(Student.class,11);
    	session.delete(s4);
	
    	
    	tx.commit();
    	session.close();
    }
}
