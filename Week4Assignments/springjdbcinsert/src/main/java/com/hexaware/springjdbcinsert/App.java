package com.hexaware.springjdbcinsert;

import com.hexaware.springjdbcinsert.dao.DaoProductImp;
import com.hexaware.springjdbcinsert.entity.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Product product=new Product();
       product.setProductName("MakeUp-Kit");
        product.setProductCost(1000);
       
        
        DaoProductImp daopro=new DaoProductImp();
        daopro.insertProduc(product);
        
        
    }
}
