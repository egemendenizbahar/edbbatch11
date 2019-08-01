package LOOPS;

import java.util.Scanner;

public class hiBye {
	
	//Write a program that asks from the user infinitely:
	
	//if user enters "hi" your program answers "hello", if user enters "bye" your program says "good bye"
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		for(; ;) {
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase("hi")) {
				System.out.println("hello");
			} else {
				System.out.println("Good bye");
			}
		}
	
	}
}