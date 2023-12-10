package com.hexaware.SpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.hexaware.SpringApp.beans.Product;
import com.hexaware.SpringApp.service.IProductService;
import com.hexaware.SpringApp.service.ProductServiceimp;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages="com.hexaware.SpringApp")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Presentation Layer UI" );
        ApplicationContext con=new AnnotationConfigApplicationContext(App.class);
        IProductService service=con.getBean(ProductServiceimp.class);
        Product product=service.getProduct();
        System.out.println(product);
    }

	
}
