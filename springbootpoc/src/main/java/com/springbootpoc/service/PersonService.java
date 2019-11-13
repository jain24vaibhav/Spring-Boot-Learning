package com.springbootpoc.service;

import java.util.List;

import com.springbootpoc.model.Person;

public interface PersonService {
	
	public List<Person> getAllPersons();

	public void addPerson(Person p);

	public void updatePerson(Person p);

	public void deletePerson(int id);
	
	List<Person> personWithCertainAge();
	
}
