package com.hexaware.LRMappings.Entities;


	import java.util.HashSet;
	import java.util.Set;

	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;

	@Entity
	public class Employee {
		
		@Id
		private int employee_id;
		private String employee_name;
		private double salary;
		@OneToMany(cascade=CascadeType.ALL)
	    private Set<LeaveType> lr =new HashSet<LeaveType>();
        
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

		public Set<LeaveType> getLr() {
			return lr;
		}

		public void setLr(Set<LeaveType> lr) {
			this.lr = lr;
		}

	public Employee() {
		super();
	}

	public Employee(int employee_id, String employee_name, double salary, Set<LeaveType> lr) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.salary = salary;
		this.lr = lr;
	}
	public void addLeaveRequest(LeaveType lr1) {
	    lr1.setEmp(this);
	    Set<LeaveType> set = getLr();

		set.add(lr1);
	}

	

}
