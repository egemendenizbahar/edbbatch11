package LoopLabel;

import java.util.Random;
import java.util.Scanner;

public class TaskOne {
	
//		ProgramPhoneNumberValidator
//		 -simple phone number format check.Accepts phone number in one of two formats: 
//		(312)3334444 or 3123334444
//		Check:- if length is not 12 or 10 characters, then -> show error 
//		message :“invalid length - must be either 12 or 10 characters.
//		"- If first character is '('then1.fifth character must be')' "
//		 "->if not show error message:“Invalid format -there is no closing parenthesis.”"
//		 "- Get rid of parentheses using replace method"
//		 "-Using a loop check if each character is a number between 0-9. "
//		 "-> if not show error message:“Invalid character - must be a number between 0-9.” "
//		 "-If all checks pass print “Valid Phone number” "
	
//		 "Flow: "
//		 "Please enter the phone number:"
//		 "> 3124563452"
//		 "Valid Phone number"
//		 "Please enter the phone number:"
//		 "> 31245634"
//		 "Invalid length - must be either 12 or 10 characters."
//		 "Please enter the phone number:"
//		 "> 31245634sd"
//		 "Invalid character - must be a number between 0-9
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		boolean valid = true;
		System.out.println("Please enter the phone number:");
		String phone = input.next();
		System.out.println(phone.length());
		if(!(phone.length() == 10 || phone.length() == 12)) {
			valid = false;
			System.out.println("Invalid length");
		}
		else if(phone.length() == 12) {
			if(!(phone.charAt(0) == '(' && phone.charAt(4) == ')')) {
				valid = false;
				System.out.println("Invalid format phone number");
			}
		}
		phone = phone.replace("(", "");
		phone = phone.replace(")", "");
		System.out.println(phone);
		if(phone.length() == 10) {
			for(int i = 0; i < phone.length(); i++) {
				char c = phone.charAt(i);
				int ii = c;
				if(ii < 48 || ii > 57) {
					valid = false;
					System.out.println("Must be number between 0 - 9");
					break;
				}
			}
			
		}
		if(valid) {
			System.out.println("Valid phone number");
		}
	
		
}
		
}
	
		
		
	


