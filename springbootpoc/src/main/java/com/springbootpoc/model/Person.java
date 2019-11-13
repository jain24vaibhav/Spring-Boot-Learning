package com.springbootpoc.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String address;
	private int age;
	private LocalDate registrationDate;
	private LocalDate updationDate;
}
