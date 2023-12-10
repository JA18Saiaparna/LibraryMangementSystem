package com.hexaware.restcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.hexaware.restcrud.entities.Employee;
import com.hexaware.restcrud.repository.EmployeeRepository;

public class EmployeeServiceImp implements IEmployeeService {
	@Autowired
	EmployeeRepository employeeRepo;

	@Override
	public Employee insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	/*@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepo.;
	}*/

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public void deleteEmployee(Integer employee_id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(employee_id);
		
	}

	@Override
	public Employee getEmployeeById(Integer employee_id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(employee_id).orElse(new Employee());
	}

}
