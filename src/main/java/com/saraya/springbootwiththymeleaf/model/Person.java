package com.saraya.springbootwiththymeleaf.model;

import java.util.Objects;

public class Person {
	private String firstname;
	private String lastname;
	
	public Person() {}

	public Person(String firstname, String lastname) {

		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstname, lastname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(firstname, other.firstname) && Objects.equals(lastname, other.lastname);
	}

	
	
	
	

}
