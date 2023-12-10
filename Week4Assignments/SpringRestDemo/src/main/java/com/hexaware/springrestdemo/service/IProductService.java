package com.hexaware.springrestdemo.service;

import java.util.Set;

import com.hexaware.springrestdemo.entity.Product;

public interface IProductService {
     public Product  addProduct(Product product);
     public Product  updateProduct(Product product);
     public Product getByProductId(int product_id);
     public void deleteProductById(int product_id);
     public Set <Product> getAllProducts();
}
