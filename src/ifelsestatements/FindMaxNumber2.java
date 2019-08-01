package ifelsestatements;

import java.util.Scanner;

public class FindMaxNumber2 {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		System.out.println("Please enter three integers: ");
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		

		
		if(a == b && a == c) { //should tell system all 3 numbers are equal first
	        System.out.println("All are equal!");
	    }else if(a >= b && a >= c) {
	        System.out.println("Maximum value of " + a + "," + b + "," + c + " is: " + a + "!");
	    }else if(b>=a && b>=c) {
	        System.out.println("Maximum value of " + a + "," + b + "," + c + " is: " + b + "!");
	    }else if(c>=a && c>=b) {
	        System.out.println("Maximum value of " + a + "," + b + "," + c + " is: " + c + "!");
	    
	    }}

}

			//TASK
//1.Write a program that asks 3 integers from user and 
//finds maximum value among those 3 entered integers. 
//Print “All 3 integers are equal” if they are all equal to each other.
//Note: User if-else statement 
//Flow: 
//Please enter 3 integers: > 3 > 32 > 21 
//Maximum value of 3, 32, and 21 is: 32