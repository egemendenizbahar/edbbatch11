package ifelsestatements;

import java.util.Scanner;

public class CalculatorSwitchStatement {
	public static void main(String[] args) {
		
		double number1, number2, result = 0.0;
		String operator;
		boolean invalidOperator = false;
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Please enter two double values: ");
		number1 = input.nextDouble();
		number2 = input.nextDouble();
		
		System.out.println("Please choose operators from below options: ");
		System.out.println("+,-,*,/");
		operator = input.next();
		
		switch (operator) {
		
		case "+": 
			result = number1 + number2;
		break;
		
		case "-": 
			result = number1 - number2;
		break;
		
		case "*" : 
			result = number1 * number2;
		break;
		
		case "/" : 
			result = number1 / number2;
		break;
		
		default:
			System.out.println("Invalid operator. Please try again!");
			operator = "invalid";
			
		invalidOperator = true;
		
		if(!invalidOperator) {
			
			//!false -> true
			//!true -> false
		
			
		System.out.println("Result of: " + number1 + " " + operator + " " + number2 + " is " +result);
		
		}}
	}
		
		}
		
		
 
 				//TASK

//Write a program that asks two double values and allows 
//user to choose arithmetic operation to apply. 
//Then program should calculate based on the chosen arithmetic operator by user.
//Note: Use switch statement 
//Flow: Please enter two double values: > 23.5 > 11.3 
//Please choose operator 
//from below options: +, -, *, / > - 
//Result of 23.5 - 11.3 is 12.2