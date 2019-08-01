package StringManipulation;

import java.util.Scanner;

public class NoU {
	public static void main(String[] args) {
		
		
		//write a program that asks message from user
		//replace all "u" and "U" with empty string
		
//		String message;
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please write a message");
//		message = input.nextLine().replace("u", " ").replace("U", " ");
//		System.out.println(message);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please write a message");
		String message = input.nextLine();
		message = message.replace("u", "");
		message = message.replace("U", "");
		System.out.println(message);
		
		
		
	}

}
