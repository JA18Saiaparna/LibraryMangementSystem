package com.hexaware.productapi.dto;



import jakarta.validation.constraints.Min;





public class ProductDto {
	private int pid;
	//@Pattern(regexp="[A-Z][a-z]{3,6}")
	
    private String pname;
	@Min(1000)
    private double price;
   
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    
}
