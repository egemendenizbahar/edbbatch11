package mondayProject41;

import java.util.Scanner;

public class task1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		for(int i = 0; i < 8; i++){
		      for(int j = 8; j > i; j--){
		        System.out.print(" ");
		      }
		      System.out.print("*");
		      for(int k = 0; k < i; k++) {
		        System.out.print("**");
		      }
		      System.out.println();
		    }
		    
		    
		  }
		}
