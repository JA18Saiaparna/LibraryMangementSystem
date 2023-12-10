package com.hexaware.restcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.restcrud.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	
	    public Employee findByEmployee_name(String employee_id);
	    public Employee findBySalary(Double employee_salary);
	}


