package com.hexaware.SpringJdbc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.hexaware.SpringJdbc.DataSource;

public class AppConfig {

	public AppConfig() {
		@Autowired
		Environment env;
	    public DataSource datasource()
	    {
	    	DriverManagerDataSource datasource=new DriverManagerDataSource();
	    	datasource.getUrl(env.getProperty("url"));
	    }
	}

}
