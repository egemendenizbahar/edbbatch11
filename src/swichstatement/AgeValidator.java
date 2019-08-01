package swichstatement;

import java.util.Scanner;

public class AgeValidator {
	
	public static void main(String[] args) {
		
		              //TASK
		//Write a program that asks age from the user
		//switch based on the age
		//if age 16 print "almost done with high school"
		//for 24 print "almost done with university"
		//for everything else print "keep living"
		//make sure entered age is only between 0 -120
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = input.nextInt();
		
		
		
		if(age > 0 && age <=120) {
			
		switch(age) {
		case 16:
			System.out.println("Almost done with the high school.");
			System.out.println("Be patient!");
			break;
		case 24:
			System.out.println("Almost done with university");
			
		default:
			System.out.println("Keep it living");
	
		
		}
	}
		else {
			System.out.println("Invalid age");
		}
	}
}
