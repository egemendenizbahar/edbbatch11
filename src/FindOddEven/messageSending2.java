package FindOddEven;

import java.util.Random;
import java.util.Scanner;

public class messageSending2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String message;
		boolean sent, delivered;
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
		
	//TASK2
	//declare boolean for "delivered" status.
	//generate random number 0-10
	// check generated number. If even then set "delivered" to true
	//if number is odd set "delivered status to false"
	//move the full message info to the bottom and add "delivered" status.
		
		
		Random random = new Random();
		int r = random.nextInt(10);
		if(r % 2 == 0) {
			delivered = false;
		} else {
			delivered = true;
			}
		System.out.println("Message: " + message);
		System.out.println("Sent: " + sent);
		System.out.println("Delivered: " + delivered);
		}
			
		
}

		
		
		
		
		
		
		
		
		
		
	

