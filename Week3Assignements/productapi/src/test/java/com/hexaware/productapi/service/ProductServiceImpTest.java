package com.hexaware.productapi.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.productapi.dto.ProductDto;
import com.hexaware.productapi.entity.ProductEntity;
@SpringBootTest
class ProductServiceImpTest {
	@Autowired
	IProductService service;

	@Test
	void testAddProduct() {
		ProductDto productdto=new ProductDto();
		productdto.setPname("Fridge");
		productdto.setPrice(45000);
		ProductEntity productentity=service.addProduct(productdto);
		assertEquals("Fridge",productentity.getPname());
	}


	@Test
	void testGetProductById() {
		
	}

	@Test
	void testGetAllProducts() {
		
	}

}
