package StringManipulation;

import java.util.Scanner;

public class ex1 {
	
	
//					TASK:
//		Write a program that asks user to enter the name.
//		Print "cool" if entered name first letter is 'a'
//		and ends 'z', and print "not very cool" if otherwise.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		name = name.toLowerCase().trim();
		
		
		if(name.isEmpty()) {
			System.out.println("Invalid name"); 
			
		}else {
			char first = name.charAt(0);
			int l = name.length();
			char last = name.charAt(l- 1);
			
			
			
			if(first == 'a' && last == 'z') {
				System.out.println("Cool");
			} else {
				System.out.println("Not very cool");
		}
		
		
		}
		
		
		
		//Modify the code to check if name is empty
		//if empty then print "Enter valid name"
		//if not empty apply the logic
	
	}


}
