package swichstatement;

import java.util.Scanner;

public class deneme {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);  
	    
	    System.out.println("Enter number in word(ex: one, two..):");
	    String str1 = input.nextLine();
	    str1 = str1.trim().toLowerCase();
	
	switch (str1) {
	
	case ("zero"):
	System.out.println(0);
	  break;
	  case ("one"):
	    System.out.println(1);
	    break;
	  case ("two"):
		  System.out.println(2);
		break;
	  case ("three"):
		  System.out.println(3);
		break;
	  case ("four"):
		  System.out.println(4);
		 break;
	  case ("five"):
	    System.out.println(5);
	    break;
	  case ("six"):
		  System.out.println(6);
		 break;
	  case ("seven"):
	    System.out.println(7);
	    break;
	  case ("eight"):
		  System.out.println(8);
		 break;
	  case ("nine"):
		  System.out.println(9);
		 break;
	  case ("ten"):
	    System.out.println(10);
	  	break;
	

	  default:
	  System.out.println("Out of bound");
	  
	    
	  }
	    
	}

}
