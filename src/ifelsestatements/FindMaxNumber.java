package ifelsestatements;

import java.util.Scanner;

public class FindMaxNumber {

	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	
	int number1, number2;
	System.out.println("Please enter two integers: ");
	
	number1 = input.nextInt();
	number2 = input.nextInt();
	
	
	if (number1 > number2) {
		System.out.println("Max Number: " + number1);
	}
	else {
		System.out.println("Max Number: " + number2);
	}
	
}
}




//TASK
////Write a program that asks two integers from user and find the maximum number.
////Pseudo code --> writing the approach in english and stating the steps of each statements.
////
////1. Create scanner --> this helps us to read integers. 
////
////2. Read two integers and store them into variables.
////number1, number2
////
////3. Using if statement we compare number1 to number2.
//4.print maximum number is condition meets.
//