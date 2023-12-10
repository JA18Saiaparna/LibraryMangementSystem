package com.hexaware.springrestdemo.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestdemo.entity.Product;
import com.hexaware.springrestdemo.dao.IProductDao;

@Service
public class ProductServiceImp implements IProductService {
	
	
	@Autowired
    IProductDao dao;
	
	@Override
	public Product addProduct(Product product) {


		return dao.addProduct(product);
	}

	@Override
	public Product updateProduct(Product product) {
	
		return dao.updateProduct(product);
	}

	@Override
	public Product getByProductId(int productId) {
		
		return  dao.getByProductId(productId);
	}

	@Override
	public void deleteProductById(int productId) {
		
				dao.deleteProductById(productId);

	}

	@Override
	public Set<Product> getAllProducts() {
	
		return  dao.getAllProducts();
	}

}



