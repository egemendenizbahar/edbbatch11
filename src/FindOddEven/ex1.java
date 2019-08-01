package FindOddEven;

import java.util.Random;

public class ex1 {
	
			//	TASK
	//Write a program that can detect if number is even or odd.
	//Program will generate random number between 0 - 10. 
	//Your program needs to print “Number is even” 
	//if randomly generated number is even, if not print “Number is odd”. 
	
	
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int randomValue = random.nextInt(100);
		System.out.println(randomValue);
		int remainder = randomValue %2;
		if(remainder == 0) {
			System.out.println("Number is Even!");
		}
		else {
			System.out.println("Number is Odd!");
		}
				
		
	}

}
