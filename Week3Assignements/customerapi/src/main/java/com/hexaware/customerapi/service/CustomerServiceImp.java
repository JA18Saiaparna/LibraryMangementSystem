package com.hexaware.customerapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hexaware.customerapi.dto.CustomerDto;
import com.hexaware.customerapi.dto.CustomerProductVO;
import com.hexaware.customerapi.dto.ProductDto;
import com.hexaware.customerapi.entity.CustomerEntity;
import com.hexaware.customerapi.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements ICustomerService {
	@Autowired
	RestTemplate restTemplate;
	@Autowired
    CustomerRepository customerRepo;
	@Override
	public CustomerEntity insert(CustomerDto customerdto) {
		// TODO Auto-generated method stub
		CustomerEntity customerentity=new CustomerEntity();
		customerentity.setCustomerId(customerdto.getCustomerId());
		customerentity.setCustomerName(customerdto.getCustomerName());
		customerentity.setDateOfBirth(customerdto.getDateOfBirth());
		customerentity.setDateOfBirth(customerdto.getDateOfBirth());
		customerentity.setProductId(customerdto.getProductId());
		
		return customerRepo.save(customerentity);
	}

	@Override
	public CustomerDto getById(int customerId) {
		// TODO Auto-generated method stub
		CustomerEntity customerentity=customerRepo.findById(customerId).orElse(new CustomerEntity());
		CustomerDto customerdto=new CustomerDto();
		customerdto.setCustomerId(customerentity.getCustomerId());
		customerdto.setCustomerName(customerentity.getCustomerName());
		customerdto.setDateOfBirth(customerentity.getDateOfBirth());
		customerdto.setProductId(customerentity.getProductId());
		return customerdto;
	}

	@Override
	public List<CustomerEntity> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	@Override
	public CustomerProductVO getCustomerAndProductById(int customerId) {

		CustomerDto  customerdtO =	getById(customerId);
				
					int pid =	customerdtO.getProductId();
		
		ProductDto productdtO =	restTemplate.getForObject("http://localhost:8181/api/product/get/"+pid, ProductDto.class);
			
			CustomerProductVO  customerAndProduct = new CustomerProductVO();
		
				customerAndProduct.setCustomer(customerdtO);
				customerAndProduct.setProduct(productdtO);
			
			return customerAndProduct;
		}

}
