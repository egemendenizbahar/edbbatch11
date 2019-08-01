package TASKS;

import java.util.Scanner;

public class Marchsixth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Profile edit page:");
		String firstName;
		String lastName;
		String address;
		long creditCardNumber;

		System.out.println("First name:");
		firstName = input.nextLine();
		System.out.println("Last name:");
		lastName = input.nextLine();
		System.out.println("Address:");	
		address = input.nextLine();
		System.out.println("Credit card number:");
		creditCardNumber = input.nextLong();


		System.out.println("Information you entered:");
		
		System.out.println("Name:" + firstName + lastName);
		System.out.println("Address:" + address);  
		System.out.println("CC Number:" + creditCardNumber);
		
		String yes;
		System.out.println("Save now? "
				+ "\n >yes "
				+ "\n >no");
		
		yes = input.next();
		System.out.println(yes);
		System.out.println("Thank you!");


	}
}
