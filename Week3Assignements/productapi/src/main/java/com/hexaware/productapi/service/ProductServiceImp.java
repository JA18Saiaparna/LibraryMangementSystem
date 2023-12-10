package com.hexaware.productapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.productapi.dto.ProductDto;
import com.hexaware.productapi.entity.ProductEntity;
import com.hexaware.productapi.repository.ProductRepository;
@Service
public class ProductServiceImp implements IProductService {
    
	@Autowired
	ProductRepository repo;
	@Override
	public ProductEntity addProduct(ProductDto productdto) {
		// TODO Auto-generated method stub
		ProductEntity productentity=new ProductEntity();
		productentity.setPname(productdto.getPname());
		productentity.setPrice(productdto.getPrice());
		return repo.save(productentity);
	}
	@Override
	public ProductEntity updateProduct(ProductDto productdto) {
		ProductEntity productentity=new ProductEntity();
		productentity.setPname(productdto.getPname());
		productentity.setPrice(productdto.getPrice());
		return repo.save(productentity);
	}
	


	@Override
	public ProductDto getProductById(int pid) {
		ProductEntity productentity=repo.findById(pid).orElse(new ProductEntity());
		ProductDto productdto=new ProductDto();
		productdto.setPid(productentity.getPid());
		productdto.setPname(productentity.getPname());
		productdto.setPrice(productentity.getPrice());
		return productdto;
		
	}

	@Override
	public List<ProductEntity> getAllProducts() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
		
	}

	
}
