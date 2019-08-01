package FindOddEven;

import java.util.Random;
import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		
		//Task
//	Write a program that asks from the user to guess
//	the random number. Random number will be generated
//	between 0 - 10. If user finds the number
//	print “Congratulations!”.
//	If user’s guess is less than random number
//	print 
//	“your guess is too low”, if more print “your guess is too high”.
// extra task: give the second chance to the user
		
		
int number, guess;
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		//shortcut for importing the classes command + shift + o
		
		number = random.nextInt(10);
		
		System.out.println("Please enter your guess between 0-10:");
		guess = input.nextInt();
		
		if(guess == number) {
			System.out.println("Congratulations!");
	
		} else if(guess > number) {
			System.out.println("Your guess is too high. The number is " + number + ". Please try again.");
		} else {
			System.out.println("Your guess is too low. The number is " + number + ". Please try again.");
			
			
			
		}
	
	}

}
