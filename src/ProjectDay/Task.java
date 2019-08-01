package ProjectDay;
import java.util.*;

public class Task {
	  public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);  
	    
	    // TASK 1
	    System.out.println("Enter number:");
	    int x = input.nextInt();
	    
	    //your code here 
	    //----------------------------------------------------------


	int i = 1;
			while (i <= x) {
				
				if (i % 6 == 0) {
				
				System.out.print(i * i);
				System.out.println(" ");
				}
				i++;
			}

	  
	    //----------------------------------------------------------
	    
	    //TASK 2
	    System.out.println("Enter word:");
	    String str1 = input.next();
	    
	    //your code here 
	    //---------------------------------------------------------- 
	    String num = "";

	for(int j = 0; j < str1.length(); j++) {
		if(str1.charAt(j) > 47 && str1.charAt(j) < 58) {
			num += str1.charAt(j);
		}
	}

	System.out.println(num);
	    
	    
	    
	    
	    
	    //----------------------------------------------------------
	    
	    //TASK 3
	    //your code here 
	    //----------------------------------------------------------
	    
	    String str;
	    int number, positive = 0, negative = 0, zero = 0;

	do {
		System.out.print("Enter the number: ");
		number = input.nextInt();
		System.out.print("Do you want to continue y/n? ");
		str = input.next();

		if(number > 0) {
			positive++;
		} else if(number < 0) {
			negative++;
		} else {
			zero++;
		}

	} while(str.equals("y"));

	System.out.println("Positive numbers: " + positive);
	System.out.println("Negative numbers: " + negative);
	System.out.println("Zero numbers: " + zero);
	    
	    

	  }
	
	}


