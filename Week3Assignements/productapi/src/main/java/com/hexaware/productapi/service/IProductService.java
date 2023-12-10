package com.hexaware.productapi.service;

import java.util.List;

import com.hexaware.productapi.dto.ProductDto;
import com.hexaware.productapi.entity.ProductEntity;

public interface IProductService {
   public ProductEntity addProduct(ProductDto productdto);
   public ProductEntity updateProduct(ProductDto productdto);
   public ProductDto getProductById(int pid);
   public List <ProductEntity> getAllProducts();
}
