package com.limo.blog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.limo.blog.entities.Person;
import com.limo.blog.repos.PersonRepository;

@Service
public class PersonServiceImpl implements PersonsInterface {
	@Autowired
	PersonRepository personrepository;
	

	@Override
	public Person getPerson(int id) {
		
		return personrepository.getOne(id);
	}

}
