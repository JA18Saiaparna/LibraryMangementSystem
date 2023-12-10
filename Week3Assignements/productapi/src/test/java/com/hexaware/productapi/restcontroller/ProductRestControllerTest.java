package com.hexaware.productapi.restcontroller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.productapi.dto.ProductDto;
import com.hexaware.productapi.entity.ProductEntity;
@SpringBootTest
class ProductRestControllerTest {
	@Autowired
    RestTemplate restTemplate;
	Logger logger= LoggerFactory.getLogger(ProductRestController.class);
	String baseURL="http://localhost:8181/api/product";
	@Test
	void testAddProduct() {
		ProductDto productdto=new ProductDto();
		productdto.setPname("Scooty");
		productdto.setPrice(95000);
		
		ProductEntity productentity =restTemplate.postForObject(baseURL+"/add", productdto, ProductEntity.class);
	    logger.info("ProductAdded"+productentity);
	    assertNotNull(productentity);
	}

	@Test
	void testGetProductById() {
	int pid=1;
	ResponseEntity<ProductEntity>response=restTemplate.getForEntity("http://localhost:8181/api/product/get/"+pid, ProductEntity.class);
	ProductEntity productentity=response.getBody();
	logger.info("Product"+productentity);
	assertTrue(productentity.getPid()>0);
	 
	}

	@Test
	void testGetAllProducts() {
		
		List <ProductEntity> list = restTemplate.getForObject(baseURL+"/getall",List.class);
		logger.info("List of Products"+list);
		assertNotNull(list);
		
	}

}
