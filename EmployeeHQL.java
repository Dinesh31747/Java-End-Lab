package com.klu.FirstHibProject;

import java.util.List;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import java.util.*;


public class EmployeeHQL {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		
		/*
		 * Query<Employee> query = s.createQuery("From Employee"); List<Employee>
		 * empList = query.list();
		 */
		
		
		/*Query<Employee> q = s.createQuery("from Employee where empSal < :sal");
		q.setParameter("sal", new Double(150000));
		List<Employee> empList = q.list();
		for(Employee e : empList) {
			System.out.println(e);
		}*/
		
		/*
		 * Query<Employee> q =
		 * s.createQuery("delete from Employee as e where e.empSal = :sal");
		 * q.setParameter("sal", 15000.00); Transaction tx = s.beginTransaction(); int n
		 * = q.executeUpdate(); if(n > 0) System.out.println(n + " rows Deleted!"); else
		 * { System.out.println("No row deleted"); }
		 */
		/*
		 * Query<Employee> q = s.
		 * createQuery("update Employee as e set e.empDesig = :desig where e.empSal = :sal"
		 * ); q.setParameter("desig", "Lead"); q.setParameter("sal", 150000.00);
		 * Transaction tx = s.beginTransaction(); int n = q.executeUpdate(); if(n > 0)
		 * System.out.println(n + " rows Updated!"); else{
		 * System.out.println("No row Updated"); }
		 * 
		 * tx.commit();
		 */
		Query<Employee> q = s.createQuery("from Employee");
		q.setFirstResult(0);
		q.setMaxResults(3);
		List<Employee> empList = q.list();
		for(Employee e : empList) {
			System.out.println(e);
		}
		s.close();
		sf.close();
	}
	
}
