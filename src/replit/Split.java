package replit;

import java.util.Scanner;

public class Split {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		String email = input.nextLine();
	    
	    //Write your code below
	    
	    
	    if(email.indexOf("@") < 0 ||email.indexOf("@") < email.lastIndexOf("@")) {
	      System.out.println("Invalid email");
	      }else {
	        String[] arr = email.split("@");
	        System.out.println("Email id: " + arr[0] + "\nEmail domain: "+ arr[1]);
	      
	    }
	    }
	    
	    
	}


