package StringManipulation;

import java.util.Scanner;

public class NoNegativity {
	public static void main(String[] args) {
		
		//Write a program that asks message from the user
		//replace word "hate" with "love
		//print new version of the message
		//I hate youuu! --> I love youuu!
		
//		String message; 
//		Scanner input = new Scanner(System.in); 
//		message = input.nextLine().replace("hate", "love");
//		
//		System.out.println(message);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your message:");
		String message = input.nextLine().toLowerCase();
		message = message.replace("hate", "love");
		System.out.println(message);
		
		
	}

}
