package WhileLoop;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
	
//	1.Accept a string and if it is palindrome, 
//	print 
//	"Palindrome", 
//	if not print 
//	"Not Palindrome"
//	Ex:
//		Enter word:
//		java 
//		Not Palindrome
//		civic
//		Palindrome
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word:");
		String word = input.nextLine();
		int lastIndex = word.length() - 1;
		boolean check = true;
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) != word.charAt(lastIndex)) {
				System.out.println("Not palindrome");
				check = false;
				break;
			}
			lastIndex--;
		}
		if(check) {
			System.out.println("Palindrome");
		}
		
		
				//OR

    	
    	
//        Scanner input = new Scanner(System.in);
//        System.out.print("Type a name:");
//        String word = input.nextLine();
//        String reserved = "";
//        
//        for (int i = word.length() - 1; i >=0; i--) {
//           reserved = reserved + word.charAt(i);
//
//        String reverseString = "";
//
//        if (word.equalsIgnoreCase(reserved)) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not Palindrome");
//        }
//	}
}
}