package emailapp.main;

import java.util.Scanner;

import emailapp.model.Employee;
import emailapp.service.CredentialService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		String firstName,lastName;
		int departmentNum,flag;

		//Employee details
		System.out.println("Please enter your first name:");
		firstName=scanner.next();
		System.out.println("Please enter your last name:");
		lastName=scanner.next();


		Employee employee=new Employee(firstName,lastName);
		CredentialService cs=new CredentialService();

		//Menu
		//blah:
		do {
			flag=0;
			System.out.println("Please enter the department from the following:\n1. Technical\n2. Admin\n3. Human Resources\n4. Legal\n\nYour input:");
			departmentNum=scanner.nextInt();
			switch (departmentNum) {
			case 1:
				cs.showCredentials(employee,"tech");
				break;
			case 2:
				cs.showCredentials(employee,"adm");
				break;
			case 3:
				cs.showCredentials(employee,"hr");
				break;
			case 4:
				cs.showCredentials(employee,"legal");
				break;
			default:
				System.out.println("Invalid selection! Please try again.\n");
				flag=1;
				break;
			}
		}while (flag==1);
	}
}
