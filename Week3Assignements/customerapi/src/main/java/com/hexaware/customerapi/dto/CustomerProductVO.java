 package com.hexaware.customerapi.dto;

public class CustomerProductVO {
  
	private CustomerDto customer;
	private ProductDto product;
	public CustomerDto getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDto customer) {
		this.customer = customer;
	}
	public ProductDto getProduct() {
		return product;
	}
	public void setProduct(ProductDto product) {
		this.product = product;
	}
	public CustomerProductVO(CustomerDto customer, ProductDto product) {
		super();
		this.customer = customer;
		this.product = product;
	}
	public CustomerProductVO()
	{
		
	}
	
}
