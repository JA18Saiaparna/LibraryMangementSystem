package com.hexaware.LRMappingsManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.LRMappingsManyToMany.entities.Employee;
import com.hexaware.LRMappingsManyToMany.entities.LeaveRequest;

/**
 * Hello world!
 *
 */
public class App 
{
    
    	public static void main(String[] args) {

    		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    		Session session = sessionFactory.openSession();

    		Transaction tx = session.beginTransaction();
    		
    		LeaveRequest leaveRequest=new LeaveRequest();
    		leaveRequest.setLeaveRequestId(601);
    		leaveRequest.setStartDate("11-10-2023");
    		leaveRequest.setEndDate("13-10-2023");
    		leaveRequest.setStatus("Approved");
    		
    		LeaveRequest leaveRequest2=new LeaveRequest();
    		leaveRequest2.setLeaveRequestId(602);
    		leaveRequest2.setStartDate("14-10-2023");
    		leaveRequest2.setEndDate("15-10-2023");
    		leaveRequest2.setStatus("Not Approved");
    		
    		LeaveRequest leaveRequest3=new LeaveRequest();
    		leaveRequest3.setLeaveRequestId(603);
    		leaveRequest3.setStartDate("09-10-2023");
    		leaveRequest3.setEndDate("13-10-2023");
    		leaveRequest3.setStatus("Yes Approved");
    		
    	    Employee employee=new Employee();
    		employee.setEmployee_id(1);
    		employee.setEmployee_name("Sai");
    		employee.setSalary(30000);
    		employee.addLeaveRequest(leaveRequest);
    		employee.addLeaveRequest(leaveRequest3);
    		
    		Employee employee1=new Employee();
    		employee1.setEmployee_id(2);
    		employee1.setEmployee_name("Aparna");
    		employee1.setSalary(35000);
    		employee1.addLeaveRequest(leaveRequest);
    		employee1.addLeaveRequest(leaveRequest2);
    		
    		session.persist(employee);
			session.persist(employee1);
			
			tx.commit();
			
			sessionFactory.close();
    }
}
