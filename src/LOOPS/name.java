package LOOPS;

import java.util.Scanner;

public class name {
	public static void main(String[] args) {
		
		
	//Task 1: write a program that asks from 5 names from the user and print each name
	//Task 2: write a program that asks from 5 names from the user and print each name as name 1. name 2,..
			
		Scanner input = new Scanner(System.in);
			
			for (int i = 1; i<6; i++ ) {
				System.out.println("Please print name"+i);
				String name = input.nextLine();
				System.out.println(name);
			}
		
	}

}
