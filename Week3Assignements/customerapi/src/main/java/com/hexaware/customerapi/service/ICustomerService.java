package com.hexaware.customerapi.service;

import java.util.List;

import com.hexaware.customerapi.dto.CustomerDto;
import com.hexaware.customerapi.dto.CustomerProductVO;
import com.hexaware.customerapi.entity.CustomerEntity;

public interface ICustomerService {
   public CustomerEntity insert(CustomerDto customerdto);
   public CustomerDto getById(int customerId);
   public List<CustomerEntity> getAllCustomer();
   
   public   CustomerProductVO   getCustomerAndProductById(int customerId);
}
