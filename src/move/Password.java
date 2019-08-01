package move;
import java.util.Scanner;

public class Password {
	
	//Write a program for the login to application.
	//Program should ask for the password until user hits right password.
	//Password is "secret478" If user enters right password print "welcome to your profile!" 
	//and exist the infinit loop.
	
	//Flow
	//Please enter your password
	//>James
	//Please enter your password
	//>Adam
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int attempts = 0;
		for( ; ; ) {
			System.out.println("Please enter your password?");
			String password = input.nextLine();
			attempts++;
			if(password.equalsIgnoreCase("secret478")) {
			
			System.out.println("Welcome to your profile!");
			break;
		}
			if(attempts == 3) {
				System.out.println("Your account is locked. Try after 5 hours");
				break;
			}
		}
		
					//OR
		
		//for(int i = 0; i < 3; i++) {
//		System.out.println("Enter your password");
//		String password = input.nextLine();
//		if (password.equals("secret478")) {
//			System.out.println("Welcome to your profile!");
//			break;	
//		}
//		else if (i == 2){
//			System.out.println("Sorry, your account is locked. Try after 5 hours");	
		}

		
}
		
		//Modify the above task:
		//Give 3 attempts to login.
		//If user fails to enter right password within 3 attempts print "Sorry. Your account is locked. Try 
		//after 5 hours" and the program.
		
		
		
	


