package LOOPS;

import java.util.Scanner;

public class Apple {
	public static void main(String[] args) {
		
		// TASK
		
		//Please write a program that asks the name from user
		//using Scanner and print "Welcome,%name" for 15 time.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = input.nextLine();
		
		for(int i = 0; i<15 ; i++) {
			
			
		System.out.println("Welcome " + name);
		
		}}
}