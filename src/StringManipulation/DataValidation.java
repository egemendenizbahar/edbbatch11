package StringManipulation;

import java.util.Scanner;

public class DataValidation {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
	
		if(name.isEmpty()) {
			System.out.println("You didn't provide the name");
			
		}else {
			System.out.println("Your name: " + name);
		}
		
	}

}
