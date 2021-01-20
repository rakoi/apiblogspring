package com.limo.blog.controllers;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.limo.blog.services.SecurityService;

@Controller
public class UserController {
	@Autowired
	public BCryptPasswordEncoder encoder;
	
	
	@Autowired
	public SecurityService securityService;
	
	
	
	@RequestMapping(value="/login")
	public String login() {
		return "index";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String Login(String username,String password,ModelMap modelMap) {
		//System.out.println("credentials are"+username+password);
	if(securityService.login(username, password)) {
		return "dashboard";
	}else {
		return "index";
	}
		
	}

	
}
