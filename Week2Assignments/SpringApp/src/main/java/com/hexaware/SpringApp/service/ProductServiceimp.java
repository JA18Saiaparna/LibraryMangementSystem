package com.hexaware.SpringApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.SpringApp.DAO.IProductDAO;
import com.hexaware.SpringApp.beans.Product;
@Service
public class ProductServiceimp implements IProductService {
    @Autowired
    IProductDAO dao;

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return dao.getProduct();
	}

}
