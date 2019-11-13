package com.springbootpoc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springbootpoc.model.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

	@Query("select p from Person p where p.age>24")
	List<Person> personWithCertainAge();
	
	@Query("select p from Person p where p.id=:id")
	Person getPersonById(@Param("id") int id);
	
}
