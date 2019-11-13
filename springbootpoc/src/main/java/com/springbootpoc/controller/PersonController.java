package com.springbootpoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootpoc.model.Person;
import com.springbootpoc.service.PersonServiceImpl;

@RestController
public class PersonController {

	@Autowired
	private PersonServiceImpl person;

	@RequestMapping("/getpersons")
	public List<Person> getAllPersons() {
		return person.getAllPersons();
	}
	
	@RequestMapping("/getpersonwithage")
	public List<Person> getPersonWithCertainAge() {
		return person.personWithCertainAge();
	}
	

	@RequestMapping(method=RequestMethod.POST, value="/addperson")
	public void addPerson(@RequestBody Person p) {
		person.addPerson(p);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/updateperson")
	public void updatePerson(@RequestBody Person p) {
		person.updatePerson(p);
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/deleteperson/{id}")
	public void deletePersons(@PathVariable int id) {
		person.deletePerson(id);
	}
}
