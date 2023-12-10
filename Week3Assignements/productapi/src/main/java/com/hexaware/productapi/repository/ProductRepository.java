package com.hexaware.productapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.productapi.entity.ProductEntity;
@Repository
public interface ProductRepository  extends JpaRepository<ProductEntity,Integer>{

}
