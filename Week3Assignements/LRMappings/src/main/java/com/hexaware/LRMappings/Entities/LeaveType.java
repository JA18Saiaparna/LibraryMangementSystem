package com.hexaware.LRMappings.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class LeaveType {
	
	@Id
	private int Leave_request_id;
	
	private String Start_Date;
	private String End_Date;
	
	@ManyToOne 
	@JoinColumn(name="eid")
	Employee emp;
	public LeaveType() {
		super();
	}
	public int getLeave_request_id() {
		return Leave_request_id;
	}
	public void setLeave_request_id(int leave_request_id) {
		Leave_request_id = leave_request_id;
	}
	public String getStart_Date() {
		return Start_Date;
	}
	public void setStart_Date(String start_Date) {
		Start_Date = start_Date;
	}
	public String getEnd_Date() {
		return End_Date;
	}
	public void setEnd_Date(String end_Date) {
		End_Date = end_Date;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public LeaveType(int leave_request_id, String start_Date, String end_Date, Employee emp) {
		super();
		Leave_request_id = leave_request_id;
		Start_Date = start_Date;
		End_Date = end_Date;
		this.emp = emp;
	}


	
}
	
	
