package com.hexaware.springboot1.entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {
   private int employee_eid;
   private String employee_ename;
   private double employee_salary;
   
   public Employee()
   {
	   
   }
public int getEmployee_eid() {
	return employee_eid;
}
public void setEmployee_eid(int employee_eid) {
	this.employee_eid = employee_eid;
}
public String getEmployee_ename() {
	return employee_ename;
}
public void setEmployee_ename(String employee_ename) {
	this.employee_ename = employee_ename;
}
public double getEmployee_salary() {
	return employee_salary;
}
public void setEmployee_salary(double employee_salary) {
	this.employee_salary = employee_salary;
}
public Employee(int employee_eid, String employee_ename, double employee_salary) {
	super();
	this.employee_eid = employee_eid;
	this.employee_ename = employee_ename;
	this.employee_salary = employee_salary;
}
@Override
public String toString() {
	return "Employee [employee_eid=" + employee_eid + ", employee_ename=" + employee_ename + ", employee_salary="
			+ employee_salary + "]";
}
   
   

	

}
