package LoopLabel;

import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
	
	
//						TASK
//	Write a program that finds the random generated number between 0 - 100 using loop. 
//	Once program finds the random number loop has to stop and print the number of attempts.
//	Flow:
//		Target number is 49
//		Target number is found. 
//		Number of attempts: 49
	
	public static void main(String[] args) {
		

			Random random = new Random();
			int target = random.nextInt(100);
			int attempts = 0;
			for(int i = 0; i < 100; i++) {
				attempts++;
				if(i == target) {
					System.out.println("Number is found");
					System.out.println("Number of attemps: " + attempts);
					System.out.println("Target: " + target);
					break;
				}
		
			}
	}



		
	}


