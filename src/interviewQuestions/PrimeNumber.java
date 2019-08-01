package interviewQuestions;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter A Number");
	  
	    int k = input.nextInt();
			
			boolean prime = true;
			for (int i = 2; i < k; i++) {
				
				if (k % i == 0) {
				System.out.println(k + " is not prime number!");
				prime = false;
					break;
				} 
				
			if(prime) {	
			System.out.println(k + " is prime number!");
			}			
	    
	  }

	}
} //https://www.youtube.com/watch?v=TDGETBsPKjQ
