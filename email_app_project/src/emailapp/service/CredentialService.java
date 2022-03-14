package emailapp.service;

import java.util.Random;

import emailapp.model.Employee;
import emailapp.main.Main;

public class CredentialService {

	public String generatePassword(){

		String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small=capital.toLowerCase();
		String special="!@#$%^&*";
		String numbers="0123456789";
		String combined=capital+small+special+numbers;
		int index,length=8;
		char[] randomPassword=new char[length];

		// create an object of Random and Stringbuilder class
		Random random = new Random();
		StringBuilder sb= new StringBuilder();

		//generate random capital, small and special characters
		index = random.nextInt(capital.length());
		randomPassword[0] = capital.charAt(index);

		index = random.nextInt(small.length());
		randomPassword [1] = small.charAt(index);

		index = random.nextInt(special.length());
		randomPassword [2] = special.charAt(index);

		index = random.nextInt(numbers.length());
		randomPassword [3] = numbers.charAt(index);
		
		for (int i=4;i<length;i++) {
			randomPassword[i]=combined.charAt(random.nextInt(combined.length()));
		}
		
		//return string password
		sb.append(randomPassword);
		return sb.toString();
		//return new String(randomPassword);
	}

	public String generateEmailAddress(Employee employee, String department){
		String email;
		email=employee.getFirstName().toLowerCase()+employee.getLastName().toLowerCase()+"@"+department+".abc"+".com";
		return email;
	}

	public void showCredentials(Employee employee, String department){

		String firstName;

		//humanizing Name
		firstName=employee.getFirstName().substring(0,1).toUpperCase()+employee.getFirstName().substring(1).toLowerCase();

		System.out.println("Dear "+firstName+" your generated credentials are as follows:");

		String email=generateEmailAddress(employee,department);
		System.out.println("Email    --->	"+email);

		String password=generatePassword();
		System.out.println("Password --->	"+password);

	}
}
