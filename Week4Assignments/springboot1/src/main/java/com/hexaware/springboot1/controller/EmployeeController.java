package com.hexaware.springboot1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springboot1.entity.Employee;

@Controller
@RequestMapping("/addemployee")
public class EmployeeController 
   {
	@RequestMapping(path="/openForm",method=RequestMethod.GET)
	public String openForm()
	{
		return "add_employee";
	}
	@RequestMapping(path="/employee",method=RequestMethod.POST)
	@ResponseBody
   public String addEmployee(HttpServletRequest request)
   {
	   int employee_id=Integer.parseInt(request.getParameter("employee_id"));
	   String employee_name=request.getParameter("employee_name");
	   double employee_salary=Double.parseDouble(request.getParameter("employee_salary"));
	   Employee e=new Employee(employee_id,employee_name,employee_salary);
	   return e.toString();

   }
	
} 
