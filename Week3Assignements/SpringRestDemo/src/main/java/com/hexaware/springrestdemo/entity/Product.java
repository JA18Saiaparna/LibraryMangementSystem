package com.hexaware.springrestdemo.entity;

import org.springframework.stereotype.Component;

@Component
public class Product {
   private int productId;
   private String productName;
   private double productSalary;
   public Product()
   {
	   
   }
public Product(int productId, String productName, double productSalary) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productSalary = productSalary;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getProductSalary() {
	return productSalary;
}
public void setProductSalary(double productSalary) {
	this.productSalary = productSalary;
}
   
}
