package com.hexaware.SpringJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.AbstractDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Hello world!
 *
 */
@Configuration
public class App 
{
	@Autowired
	Environment env;
    public DataSource datasource()
    {
    	DriverManagerDataSource datasource=new DriverManagerDataSource();
    	datasource.getUrl(env.getProperty("url"));
    }
}
