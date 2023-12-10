package com.hexaware.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springboot1.entity.Employee;



@Controller
@RequestMapping("/controller")
public class HelloController {
	@RequestMapping(path="/hello",method=RequestMethod.GET)
	@ResponseBody
   public String sayHello()
   {
	   return " <h1 style=' color:red'>Hello!!Controller</h1>";
   }
	
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
	@ResponseBody
	
	public String getData()
	{
		Employee e=new Employee(101,"sai",30000);
		return e.toString();
		
	}
}
