package LOOPS;

import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
	
//	2. Write a program that generates the random integer 
//	between 0 - 100. Keep asking from the user to guess the 
//	number until user gets it right. Print a message
//	“Your guess is too high” if user guess is higher than random number, 
//	print “Your guess is too low” if user guess is lower than random number. 
//	Once user hits the right number print “CONGRATULATION!” And break the loop.
//	
//	Flow: Generated number is 46
//	Please guess the number:> 50
//	Your guess is too high!
//	Please guess the number:> 25
//	Your guess is too low!
//	Please guess the number:> 35
//	Your guess is too low!
//	> 46
//	CONGRATULATIONS!
	public static void main(String[] args) {
		
	
	int number, guess = -1;
	
	Scanner input = new Scanner(System.in);
	
	Random random = new Random();
	

	number = random.nextInt(100);
	
	while(number != guess) {
		System.out.println("Please guess the number:");
		guess = input.nextInt();
		
		if(guess > number) {
			System.out.println("Your guess is too high!");
			
		} else if(guess < number){
			System.out.println("Your guess is too low!");
			
		} else {
			System.out.println("CONGRATULATIONS!");
		}
	}
	}
	}
//						OR
//				Random r = new Random();
//				int target = r.nextInt(101);
//				System.out.println(target);
//				int userInput;
//				Scanner input = new Scanner(System.in);
//				
//				do {
//					System.out.println("Please enter your input:");
//					userInput = input.nextInt();
//					if(userInput < target) {
//						System.out.println("Your input is too low!");
//					}
//					else if(userInput > target) {
//						System.out.println("Your input is too high!");
//					}else {
//						System.out.println("CONGRATULATIONS!");
//					}
//				}while(target != userInput);
//
//
//
//
//
