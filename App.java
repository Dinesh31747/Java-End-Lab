package com.klu.FirstHibProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Configuration configuration = new Configuration();
//        configuration.configure();
//    	SessionFactory factory = configuration.buildSessionFactory();
        SessionFactory factory = HibernateUtil.getSessionFactory();
        
        Session session = factory.openSession();
        
        Student s = new Student();
        s.setSname("Luffy");
        s.setSemail("luffy@gmail.com");
        s.setAddress("One Peice");
        
        
        Transaction tx = session.beginTransaction();
        
        session.save(s);

        tx.commit();
        
        session.close();
        factory.close();
        
    	System.out.println(factory);


    }
}
