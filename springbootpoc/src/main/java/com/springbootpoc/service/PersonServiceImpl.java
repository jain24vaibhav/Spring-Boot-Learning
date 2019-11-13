package com.springbootpoc.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbootpoc.dao.PersonDao;
import com.springbootpoc.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao person;

	@Override
	public List<Person> getAllPersons() {
		return person.findAll();
	}

	@Override
	public void addPerson(Person p) {
		LocalDate todayDate = LocalDate.now();
		p.setRegistrationDate(todayDate);
		person.save(p);
	}

	@Override
	public void updatePerson(Person p) {
		Person originalPerson = person.getPersonById(p.getId());
		p.setUpdationDate(LocalDate.now());
		p.setRegistrationDate(originalPerson.getRegistrationDate());
		person.save(p);
	}

	@Override
	public void deletePerson(int id) {
		person.deleteById(id);
	}

	@Override
	public List<Person> personWithCertainAge() {
		return person.personWithCertainAge();
	}

}
