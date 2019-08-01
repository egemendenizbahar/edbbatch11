package LOOPS;

import java.util.Scanner;

public class James {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name:");
		String name = input.nextLine();
		
		for(int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
	}

}