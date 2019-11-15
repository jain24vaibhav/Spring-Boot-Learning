package com.springbootpoc;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springbootpoc.model.Person;
import com.springbootpoc.service.PersonServiceImpl;

@Component
public class Receiver {

	@Autowired
	private PersonServiceImpl person;

	@JmsListener(destination = "ActiveMQ.DLQ")
	public void processMessges(String message) {
		System.out.println(message);
		Person p = null;
		try {
			p = new ObjectMapper().readValue(message, Person.class);
			System.out.println(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
		person.addPerson(p);
	}
}
