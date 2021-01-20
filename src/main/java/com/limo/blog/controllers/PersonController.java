package com.limo.blog.controllers;


import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.limo.blog.entities.Person;
import com.limo.blog.repos.PersonRepository;
import com.limo.blog.services.PersonServiceImpl;

@RestController
public class PersonController {

	@Autowired
	PersonServiceImpl personServiceImpl;
	@Autowired
	PersonRepository personRepository;
	
	
	@RequestMapping(value="/blog/getPerson/{personId}")
	@ResponseBody
	public Person dashboard(@PathVariable(value="personId") int id) {
		
		return personRepository.getOne(id);
	}
	
	@RequestMapping(value="/addPerson?surname=Trump&firstname=Donald&dob=1972-10-11& email=potus@strathmore.edu&mobile_no=0727374660")
	@ResponseBody
	public int dashboard(@RequestParam("surname") 
	String surname,@RequestParam ("firstname") String Firstname,@RequestParam("dob") String dob,
	@RequestParam("email") String email,@RequestParam("mobile_no") String mobiel_no
			) {
		
		System.out.println("TEST");
		Person person=new Person();
		
		person.setSur_name(surname);
		person.setDob(dob);
		person.setMobile_no(mobiel_no);
		person.setEmail(email);
	
		if(personRepository.save(person) != null) {
			return 1;
		}else {
			return 0;
		}
	}
	
	
	
}
