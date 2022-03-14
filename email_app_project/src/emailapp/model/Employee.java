package emailapp.model;

import emailapp.main.Main;
import emailapp.service.CredentialService;

public class Employee {
	private String firstName;
	private String lastName;
	
	//Constructor
	public Employee(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}

	//Getters and setters for Employee class
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
