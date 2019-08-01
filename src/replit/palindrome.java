package replit;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		
		
			   Scanner scanner = new Scanner(System.in);
			   
			   // your code
			   //---------------------------------------
			   
			  String word = scanner.nextLine();
			   int size = word.length();
			   int additive = 0;
			   char letter = 0;
			   char letter2 = 0;
			   
			   String storage =" ";
			   for(int i = 0; i < size; i++) {
			     letter = word.charAt(i);
			     if(!(storage.contains(letter + ""))) {
			       storage+=letter;
			     }
			   }
			   System.out.println(storage);
			   
			  }
			}