package com.hexaware.springsecurity.config;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
@Configuration
@EnableWebSecurity
public class AppSecurityConfig  extends WebSecurityConfigurerAdapter{
  
	 /* @Override
	  @Bean
	  protected UserDetailsService userDetailsService()
	  {
		  List<UserDetails>users=new ArrayList<UserDetails>();
		  users.add(User.withDefaultPasswordEncoder().username("Sai").password("tiger").roles("USER").build());
		  users.add(User.withDefaultPasswordEncoder().username("Aparna").password("Queen").roles("USER").build());
		  
		  return new InMemoryUserDetailsManager(users);
	  }*/
	  @Autowired
	  private UserDetailsService userDetails;
	  @Bean
	  public AuthenticationProvider authProvider() {
			
			DaoAuthenticationProvider provider=		new DaoAuthenticationProvider();
			
				provider.setUserDetailsService(userDetails);
				//provider.setPasswordEncoder(new PasswordEncoder());
				
				provider.setPasswordEncoder(new BCryptPasswordEncoder());
				
			
				return provider;
		}

}
