package casting;

import java.util.Scanner;

public class MessageReading {
	
	
//	TASK
//	Write program that reads a message from the user through 
//	console and verifies if message is grammatically valid.  
//	Check if message is starting with upper case and ending with .(dot) 
//	or with !(exclamation mark). 
//	
//	Flow: 
//		Please enter your message: 
//			> Hello, World! 
//		Message is valid. 
//		Please enter your message: 
//			> Hey guys 
//		Message is invalid
	
	public static void main(String[] args) {
		
//		String str;
//		boolean valid = false;
//
//		Scanner input = new Scanner(System.in);
//
//		str = input.nextLine();
//
//		char c = str.charAt(0);
//		int i = c;
//
//
//		if(i >= 65 && i <= 90) {
//			if(str.endsWith(".") || str.endsWith("!")) {
//				valid = true;
//			}
//		}
//
//		if(valid) {
//			System.out.println("Message is valid");
//		} else {
//			System.out.println("Message is invalid");
//		}
//		
		
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter your message:");
			String message = input.nextLine().trim();
			char firstChar = message.charAt(0);
			int decimalValue = firstChar;
			System.out.println(decimalValue);
			if(decimalValue >= 65 && decimalValue <= 90 && (message.endsWith(".") || message.endsWith("!"))) {
				System.out.println("Valid message");
			}else {
				System.out.println("Invalid message");
			}
			
			boolean bb = Character.isUpperCase('e');
			System.out.println(bb);
			
		
			


		
	}

}
