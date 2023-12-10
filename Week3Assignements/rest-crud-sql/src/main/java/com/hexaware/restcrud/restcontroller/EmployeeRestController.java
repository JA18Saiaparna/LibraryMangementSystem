package com.hexaware.restcrud.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.restcrud.entities.Employee;
import com.hexaware.restcrud.service.IEmployeeService;


@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	@Autowired
	IEmployeeService empser;
	@PostMapping(value="/add", consumes="application/json" ,produces="application/json")
   public Employee addEmployee(@RequestBody Employee employee)
   {
		return empser.insertEmployee(employee);
   }
	/*@GetMapping(value="/getall", produces="application/json")
	public List<Employee> getAll()
	{
		return empser.getAllEmployee();
	}*/
	
	@PutMapping("/update")
	public Employee updateProduct(@RequestBody Employee employee) {

		return   empser.updateEmployee(employee);

	}
	@GetMapping("/get")
	public Employee getById(@PathVariable Integer employee_eid)
	{
		return empser.getEmployeeById(employee_eid);
	}
	
	@DeleteMapping("/delete")
	public void DeleteById(@PathVariable Integer employee_eid)
	{
		empser.deleteEmployee(employee_eid);
	}
	
	
	
	
	
}
