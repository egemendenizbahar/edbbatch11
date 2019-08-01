package FindOddEven;

import java.util.Scanner;

public class ex6 {
	
	//Write a program that asks the name from the user
	//if they enter james then ask their last name.
	//	if their name is not james then do not ask the last name.
	//	give value "nobody" if the name is james.
	//	Note: Use nested if statement.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String firstName, lastName;
		System.out.println("What is your name?");
		firstName = input.nextLine();
		if(firstName.equals("James")) {
			System.out.println("What is your lastName?");
		lastName = input.nextLine();
	} else {
		lastName = "Nobody";
	}
	System.out.println("First name: " + firstName);
	System.out.println("Last name: " + lastName);
		
		
}

		}
	
	


