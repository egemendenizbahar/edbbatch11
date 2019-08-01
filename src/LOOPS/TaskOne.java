package LOOPS;

import java.util.Scanner;

public class TaskOne {
	
//	1.Write a program that finds the unique characters only from 
//	the given string. Program should ask for a String from the 
//	user through console and print only unique characters as a result. 
//	Program should ignore cases and the white space if multiple 
//	words entered from user. 
//	Flow: 
//		Please enter the String.
//		> Hello World!
//		Result: helowrd
	
	public static void main(String[] args) {
		
		String str;
		String result = "";
		Scanner input = new Scanner(System.in);
		str = input.nextLine().toLowerCase().replace(" " , "");
		for(int i = 0; i < str.length(); i++) {
			if(result.contains(String.valueOf(str.charAt(i)))) {
			continue;
		}
		result += str.charAt(i);
		}
			
		System.out.println(result);
		
//					OR
//					Scanner input = new Scanner(System.in);
//					System.out.println("Please enter your data:");
//					String data = input.nextLine();
//					data = data.toLowerCase();
//					data = data.replace(" ", "");
//					String result = "";
//					for(int i = 0; i < data.length(); i++) {
//						char c = data.charAt(i);
//						if(result.contains(c+"")) {
//							continue;
//						}
//						result += c;
//					}
//					System.out.println(result);
//		
		
		
		}
		
	


}


