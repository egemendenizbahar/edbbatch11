package ifelsestatements;

import java.util.Scanner;

public class Profile {
	
	public static void main(String[] args) {
		
		String color = "Blue";
		
		int size = color.length();
		System.out.println(size);
		
		//length kullandiginda string icindeki keliomenin kac harf oldugunu soyluyor.
		
								
		
								//TASK
		//Write a code that asks from user to creat password
		//password must be at least 5 characters and max of 12 character. 
		//If user passes valid password print "&password created"
		//if user passes invalid password check for length
		//if length is less than 5 characters print "password length is too short"
		//if length is more than 12 characters, print "password is too long"
		
		
		Scanner input = new Scanner(System.in);
		   System.out.println("Please enter a password to create:");
		   String password = input.nextLine();
		   int lengthOfPassword = password.length();

		   if(password.length() >=5 && password.length() <=12) {
		       System.out.println(password + " created!");
		       }
		        else {
		            if(lengthOfPassword < 5 ) {
		                System.out.println("Password length is too short idiot!");
		                System.out.println("Opps! Try longer password");
		            }
		            else {
		                System.out.println("Password length is too long!");
		                System.out.println("Try shorter password!");
		            }

		    }

		    }
		}

		
		
		
		
		
	
	
	
	


