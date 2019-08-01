package interviewQuestions;

import java.util.Scanner;

public class PalindromNumbers {
	
	 public static void main(String args[]) {
		 int remainder,reverse=0;
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter A Number: ");
	        int number = scan.nextInt();
	        int temp = number;
	        while(temp !=0) {

	            
	            remainder = temp % 10;
	            reverse = reverse * 10 + remainder;
	            temp = temp /10;
	        }
	        
	        if(reverse == number){
	          
				System.out.println("It's A Palindrom Number.");
	        }else{
	            System.out.println("It's Not A Palindrom Number.");
	        }
	        
	    }
} // https://www.youtube.com/watch?v=Qq_jpFk-bII 


