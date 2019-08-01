package swichstatement;
import java.util.*;

public class Tasks {
	  public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);  
	    
	    // TASK 1
	    System.out.println("Enter number in word(ex: one, two..):");
	    String str1 = input.nextLine();
	    
	    //your code here 
	    //----------------------------------------------------------

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
		    
		

	




	    
	  
	    //----------------------------------------------------------
	    
	    //TASK 2
	    System.out.println("Enter word:");
	    String str2 = input.nextLine();
	    
	    //your code here 
	    //---------------------------------------------------------- 
	    
	    String firstPart, secondPart, substring;
	    int i;
	    
	    if(str2.length() >= 3 && str2.length() < 100) {
	    	str2 = str2.trim().toLowerCase();
	    	if(str2.length() % 2 == 0) {
	    		i = str2.length()/2 - 1;
	    		firstPart = str2.substring(0, i);
	    		substring = str2.substring(i, i + 2).toUpperCase();
	    		secondPart = str2.substring(i + 2);
	    		System.out.println(firstPart + substring + secondPart);
	    	} else {
	    		i = str2.length()/2;
	    		firstPart = str2.substring(0, i);
	    		substring = str2.substring(i, i + 1).toUpperCase();
	    		secondPart = str2.substring(i + 1);
	    		System.out.println(firstPart + substring + secondPart);
	    	}
	    } else {
	    	System.out.println("Invalid enter");
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //----------------------------------------------------------
	    
	    //TASK 3
	    
	    System.out.println("Enter two words(separate with space):");
	    String str3 = input.nextLine();
	    
	    //your code here 
	    //----------------------------------------------------------
	    
	    String word1, word2;
	    
	    str3 = str3.trim().toLowerCase();
	    i = str3.indexOf(" ");
	    str3 = str3.replace(" ", "");
	    word1 = str3.substring(0, i);
	    word2 = str3.substring(i);
	    
	    System.out.println(str3.length());
	    System.out.print(word1.substring(0,1).toUpperCase() + word1.substring(1));
	    System.out.print(" " + word2.substring(0,1).toUpperCase() + word2.substring(1));





	  }
	}

