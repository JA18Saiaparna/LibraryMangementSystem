package com.hexaware.springjdbcinsert.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.hexaware.springjdbcinsert.entity.Product;

public class DaoProductImp implements DaoProduct {
	private JdbcTemplate jt=new JdbcTemplate(getDataSource());
     public void insertProduc(Product product)
     {
    	 String sql="insert into Product values(?,?)";
         Object[] args= {product.getProductName(),product.getProductCost(),};
    	
    	 int output= jt.update(sql);
    	System.out.println(output+" Rows inserted");
    	 
     }
     public DataSource getDataSource()
     {
    	DataSource datasource= new DriverManagerDataSource("jdbc:mysql://localhost:3306/springapp","root","Aparna1*");
    	return datasource;
     }
	
}
