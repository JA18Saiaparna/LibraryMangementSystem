package com.hexaware.SpringApp.DAO;

import org.springframework.stereotype.Repository;

import com.hexaware.SpringApp.beans.Product;
@Repository
public class ProductDaoImp implements IProductDAO {

	public ProductDaoImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Product getProduct() {
		//Any db connectivity logic
		return new Product(101,"Vivo",25000);
	}

}
