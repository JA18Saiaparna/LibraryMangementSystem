package com.hexaware.LRMappings;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.LRMappings.Entities.Employee;
import com.hexaware.LRMappings.Entities.LeaveType;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		
		LeaveType leaverequest=new LeaveType();
		leaverequest.setLeave_request_id(101);
		leaverequest.setStart_Date("03-11-2023");
		leaverequest.setEnd_Date("05-11-2023");
		Employee emp=new Employee();
		emp.setEmployee_id(101);
		emp.setEmployee_name("sai");
		emp.setSalary(50000);
		
		emp.addLeaveRequest(leaverequest);
		session.persist(emp);
		tx.commit();

    }
}
