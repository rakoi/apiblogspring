package com.limo.blog.controllers;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	public Person getPerson(@PathVariable(value="personId") int id) {
		
		return personRepository.getOne(id);
	}
	
	@RequestMapping(value="/blog/addPerson",method = RequestMethod.GET)
	@ResponseBody
	public int addPerson(Person person) {
		
		
		System.out.println(person.getEmail());
		System.out.println(person.getMobile_no());
		System.out.println(person.surname);
		System.out.println(person.email);
		System.out.println(person.dob);
		System.out.println("JHEL2");
		
	

		try{
			personRepository.save(person);
		
			 
			return 1;
		}catch(Exception e) {
			System.out.println("Errors");
			return 0;
		}
		
	}
	
	@RequestMapping(value="/blog/updatePerson",method = RequestMethod.GET)
	@ResponseBody
	public int updatePerson(Person person) {
		
		

		try{
			Person Updateperson=personRepository.getOne(person.id);
			
			Updateperson.dob=person.dob;
			Updateperson.email=person.email;
			Updateperson.firstname=person.firstname;
			Updateperson.mobile_no=person.mobile_no;
			
			personRepository.save(Updateperson);
			
		
			 
			return 1;
		}catch(Exception $e) {
			return 0;
		}
		
	}
	
}
