package com.hexaware.restcrud.service;

import java.util.List;

import com.hexaware.restcrud.entities.Employee;

public interface IEmployeeService {
    public Employee insertEmployee(Employee employee);
    //public List <Employee> getAllEmployee();
    public Employee updateEmployee(Employee employee);
    public void deleteEmployee(Integer employee_id);
    public Employee getEmployeeById(Integer employee_id);
 
    
}
