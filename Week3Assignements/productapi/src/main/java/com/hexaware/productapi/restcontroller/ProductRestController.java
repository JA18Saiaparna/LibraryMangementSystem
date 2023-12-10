package com.hexaware.productapi.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.productapi.dto.ProductDto;
import com.hexaware.productapi.entity.ProductEntity;
import com.hexaware.productapi.exception.ProductNotFoundException;
import com.hexaware.productapi.service.IProductService;

import jakarta.validation.Valid;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/product")
public class ProductRestController {
	@Autowired
	IProductService service;
	
	Logger logger=LoggerFactory.getLogger(ProductRestController.class);
   
	@PostMapping(value="/add")
	public ProductEntity addProduct(@RequestBody ProductDto productdto) {
		// TODO Auto-generated method stub
		return service.addProduct(productdto);
	}
	
	@PutMapping(value="/update")
	public ProductEntity updateProduct( @Valid @RequestBody ProductDto productdto) {
		// TODO Auto-generated method stub
		return service.updateProduct(productdto);
	}
	

	@GetMapping(value="/get/{pid}")
	public ProductDto getProductById(@PathVariable int pid) throws ProductNotFoundException {
		// TODO Auto-generated method stub

		ProductDto productDTO = service.getProductById(pid);
		
			if(productDTO.getPid() == 0) {
				
				throw new ProductNotFoundException(HttpStatus.BAD_REQUEST,"Product Not Found for Pid : "+pid);
			}
		
		return productDTO;
	}

	@GetMapping(value="/getall")
	public List<ProductEntity> getAllProducts() {
		// TODO Auto-generated method stub
		logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
		return service.getAllProducts();
	}
	@GetMapping("/div/{a}/{b}")
	public int  div(@PathVariable int a,@PathVariable int b)
	{
		return a/b;
	}
	@ResponseStatus(value=HttpStatus.FORBIDDEN,reason="B value cacnot be zero")
	@ExceptionHandler({ArithmeticException.class})
	public void ExceptionHandle()
	{
		
	}
	
	@ExceptionHandler({ProductNotFoundException.class})
	public ResponseEntity <String>ProductException( ProductNotFoundException pe)
	{
		return new ResponseEntity<String>(pe.getMessage(),HttpStatus.BAD_REQUEST);
	}
}
