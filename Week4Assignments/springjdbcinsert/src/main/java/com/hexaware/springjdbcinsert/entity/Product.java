package com.hexaware.springjdbcinsert.entity;

public class Product {
   
   private String productName;
   private double productCost;
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getProductCost() {
	return productCost;
}
public void setProductCost(double productCost) {
	this.productCost = productCost;
}
public Product()
{
	super();
}
public Product(String productName, double productCost) {
	super();
	this.productName = productName;
	this.productCost = productCost;
}

   
}
