package FindOddEven;

import java.util.Scanner;

public class messageSending {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		String message;
		boolean sent;
		System.out.println("Please enter your message: ");
		message = input.nextLine();
		
		if(message.length() >= 15) {
			sent = true;
		}
			else {
				sent = false;	
			}
		System.out.println("Message: " + message);
		System.out.println("Sent status: " + sent);
		
	
//	TASK
//Write a program that asks user to enter the message to send.
//Declare boolean status for the message ‘sent’. 
//Check if message length is at least 15 characters.
//If at least 15 chars then set the value true to the status sent, 
//if not false to the status sent. 
//In the end print the message same as below:

}

}
