package com.hexaware.restcrud.entities;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_details")
public class Employee implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private Integer employeeId;
   private String employeeName;
   private Double employeeSalary;
   private LocalDate doj;
public Integer getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public Double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(Double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public LocalDate getDoj() {
	return doj;
}
public void setDoj(LocalDate doj) {
	this.doj = doj;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
			+ employeeSalary + ", doj=" + doj + "]";
}
   
}
