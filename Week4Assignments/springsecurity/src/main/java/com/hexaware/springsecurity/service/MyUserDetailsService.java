package com.hexaware.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hexaware.springsecurity.entity.UserEntity;
import com.hexaware.springsecurity.repository.UserRepository;
@Service
public class MyUserDetailsService  implements UserDetailsService{
	@Autowired
    UserRepository userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		UserEntity user =		userRepo.findByUserName(username);
		
		
		if(user == null) {
			
			throw new UsernameNotFoundException(username);
		}
		
		return new UserPrinciple(user);
	}
	}
	
		
	
	


