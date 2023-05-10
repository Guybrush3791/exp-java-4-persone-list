package org.java.obj;

import java.time.LocalDate;

public class Person {

	private String name;
	private String lastname;
	private LocalDate dateOfBirth;
	
	public Person(String name, String lastname, LocalDate dateOfBirth) throws Exception {
		
		setName(name);
		setLastname(lastname);
		setDateOfBirth(dateOfBirth);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		
		if (name.length() <= 3 || name.length() > 32) {
			
			throw new Exception("Il nome non puo' essere "
					+ "composto da meno di 3 caratteri");
		}
		
		this.name = name;
	}
	public String getLastname() {
		
		return lastname;
	}
	public void setLastname(String lastname) throws Exception {
		
		if (lastname.length() <= 3 || lastname.length() > 32) {
			
			throw new Exception("Il cognome non puo' essere "
					+ "composto da meno di 3 caratteri");
		}

		this.lastname = lastname;
	}
	public String getFullName() {
		
		return getName() + " " + getLastname();
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		
		return "(P) " + getName() + " " + getLastname() + " - " + getDateOfBirth();
	}
}
