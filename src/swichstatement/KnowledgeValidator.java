package swichstatement;

import java.util.Scanner;

public class KnowledgeValidator {
	
	//Write a program that asks Grade from user
	//User must enter one character they are A, B, C, D, F
	//Switch based on the characters and print proper messages.
	// A-great B-good C-not bad D-study more F-you suck!
	//MUST USE STRING
	//Check for the length of the grade. If not one character give them proper message.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grade? ");
		String grade = input.nextLine();
		
		grade = grade.toUpperCase();  //bu durum kucuk de yazsan buyuk de yazsan buyk harfe cevirir.
		
		if(grade.length() > 1) {
			System.out.println("Invalid data. Please enter your grade");
		}
		else {
			
			switch(grade) {
			
			case "A":
				System.out.println("Great job!");
				break;
			case "B":
				System.out.println("OkAy job!");
				break;
			case "C":
				System.out.println("Not bad!");
				break;
			case "D":
				System.out.println("try harder!");
				break;
			case "F":
				System.out.println("You suck!");
			
			default:
				System.out.println("Invalid Grade");
			
		}
		}
		
	}
	
	}
