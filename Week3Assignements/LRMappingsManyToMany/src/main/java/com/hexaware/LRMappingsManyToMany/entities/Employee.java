package com.hexaware.LRMappingsManyToMany.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;



@Entity
public class Employee {
	@Id
	private int employee_id;
	private String employee_name;
	private double salary;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="employee_leaveRequests", joinColumns = {@JoinColumn(name="employee_id")} , inverseJoinColumns = {@JoinColumn(name="leaveTypeId")})
	private Set<LeaveRequest>leaveRequest=new HashSet<>();
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Set<LeaveRequest> getLeaveRequest() {
		return leaveRequest;
	}
	public void setLeaveRequest(Set<LeaveRequest> leaveRequest) {
		this.leaveRequest = leaveRequest;
	}
	
	public void addLeaveRequest(LeaveRequest leaveRequest) {
		
		
		Set<LeaveRequest> set =	getLeaveRequest();
		
				set.add(leaveRequest);
	
}
	
	
}
	