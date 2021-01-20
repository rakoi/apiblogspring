package com.limo.blog.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.limo.blog.entities.User;
import com.limo.blog.repos.UserRepository;

@Service
public class UserDetails implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;
	@Override
	public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		
		User user=userRepository.findByUsername(username);
		
		if(user==null) {
			throw new UsernameNotFoundException(username);
		}else {
			return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),user.getRoles());
		}
		
		
		
	}

}
