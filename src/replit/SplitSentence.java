package replit;

import java.util.Scanner;

public class SplitSentence {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    //type your code below
	    
	    String[] arr = sentence.split( " ");
	    
	    for(int i = arr.length - 1; i >=0; i--) {
	      System.out.println(arr[i]);
	    }
	    
	    
	  }
	
		
	}


