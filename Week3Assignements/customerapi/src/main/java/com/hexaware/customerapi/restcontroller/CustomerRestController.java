package com.hexaware.customerapi.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.customerapi.dto.CustomerDto;
import com.hexaware.customerapi.dto.CustomerProductVO;
import com.hexaware.customerapi.entity.CustomerEntity;
import com.hexaware.customerapi.service.ICustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {
	@Autowired
	  ICustomerService customerService;
      @PostMapping(value="/insert")
	 public CustomerEntity insert(@RequestBody CustomerDto customerdto)
	 {
    	  return customerService.insert(customerdto);
	 }
      @GetMapping(value="/get/{customerId}")
	   public CustomerDto getById(@PathVariable int customerId)
	   {
		   return customerService.getById(customerId);
	   }
      @GetMapping(value="/getall")
	   public List<CustomerEntity> getAllCustomer()
	   {
		   return customerService.getAllCustomer();
	   }
      @GetMapping("/get/customer-product/{customerId}")
  	public CustomerProductVO  getCustomerAndProduct(@PathVariable int customerId) {
  		
  		return customerService.getCustomerAndProductById(customerId);
  		
  	}
  	
}
