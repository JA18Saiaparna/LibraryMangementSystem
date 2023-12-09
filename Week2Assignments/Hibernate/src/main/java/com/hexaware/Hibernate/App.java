package com.hexaware.Hibernate;

import java.io.Serializable;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hexaware.Hibernate.entities.Employee;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


    SessionFactory sessionFactory =	HibernateUtil.getSessionFactory();
    
    		System.out.println(sessionFactory);
    		
    		Session session =		sessionFactory.openSession();
    		
    			Transaction tr =	session.beginTransaction();
    		
    			//Employee emp = new Employee(101, "Javeed", 30000);
    			
    			//Serializable ser =		session.save(emp);
    			
    			//System.out.println(ser.toString() +" record inserted");
    			
    			//Employee emp = new Employee(101, "Javeed", 55000);
    			//Employee emp = new Employee(102, "SaiAparna", 35000);
    			//Employee emp = new Employee(103, "Jyothika", 45000);
    			/*Employee emp = new Employee(104, "Madhu", 40000);
    			session.saveOrUpdate(emp);
    			
    			System.out.println(" record Updated/Saved");*/
    			
    			/*Employee empRecord=session.get(Employee.class, 101);
    			System.out.println(empRecord);
    			
    			session.delete(empRecord);*/
    			
    			Query <Employee> query=session.createQuery("select e from Employee e where ename='Javeed' ");
    			System.out.println(query.getSingleResult());
    				
    			tr.commit();
    		
    
    	
    }
}
