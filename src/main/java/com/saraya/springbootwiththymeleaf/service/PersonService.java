package com.saraya.springbootwiththymeleaf.service;

import java.util.ArrayList;
import java.util.List;

import com.saraya.springbootwiththymeleaf.model.Person;

public class PersonService {

	private static List<Person> pers = new ArrayList<>();
	static {
		pers.add(new Person("",""));
		pers.add(new Person("",""));
	}
	
	public Person createPerson(String firstname,String lastname){
		Person p= new Person(firstname, lastname);
		pers.add(p);
		return p;
	}
}
