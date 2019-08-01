package Input;

import java.util.Scanner;

public class TimeCalculator {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\nWelcome to Time Calculator!\n");
		
		System.out.println("Please enter seconds:");
		int seconds = input.nextInt();
		int minutes = seconds/60;
		int remainingSeconds = seconds % 60;
		int hours = minutes/60;
		int remainingMinutes = minutes % 60;
		System.out.println(seconds + " seconds converted into:");
		System.out.println(hours + " hours");
		System.out.println(remainingMinutes + " minutes");
		System.out.println(remainingSeconds + " seconds");
		
		
		
	
		
		// \n -->asagi dogru bosluk birakmak icin 
		//  \t --> on tarafta bosluk birakmak icin
		
//		TASK
		//1.Please write a program that converts seconds to minutes. 
//		Program should ask from user to enter the total seconds to be converted and 
//		based on that input it should calculate and print in following format: 
//		Input: 
//		Welcome to time calculator!!! Please enter total seconds:  
//		100 100 seconds converted into: 1 minutes 40 seconds 
//		Input: 
//		Welcome to time calculator!!! Please enter total seconds:
//		5000 5000 seconds converted into 83 minutes 20 seconds
		
	}

}