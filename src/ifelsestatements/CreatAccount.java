package ifelsestatements;

import java.util.Scanner;

public class CreatAccount {
	
	public static void main(String[] args) {
		
		String username1 = "test";
		String username2 = "james";
		
		//Write a code that asks to create username from user on console.
		//Check if entered username already exists in the database. (In database there are two usernames now.)
		//If entered username already exists print "username taken" else "username created!"
		
		
		Scanner input =new Scanner(System.in);
		System.out.println("Please enter username to creat: ");
		String enteredUsername = input.nextLine();
		if(enteredUsername.contentEquals(username1) || enteredUsername.contentEquals(username2)) {
			System.out.println("username taken");
			
			
		}
		
		else {
			System.out.println("username created!");
			
		}
		
	
		
	}

}
