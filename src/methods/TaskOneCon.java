package methods;

import java.util.Scanner;

public class TaskOneCon {
	
//	1. Create a method that accepts String. Method should check if given 
//	String contains word “con”. If yes then it removes word “con” from the 
//	given String and returns modified String.
//	
//	Special cases:
//		1.You need to check if given String is ONLY one word. If given string is 
//		two or more words then print “Invalid data”, terminate the method and return empty String. 
//				
//		2.You need to check if given String length is at least 3. 
//		If less than 3 then print “Invalid data”, terminate the method and return empty String. 
//		
//		3.If given String doesn’t contain word “con” return the given word itself. 
//				
//				Input: “Consequences”
//				Output: “sequences” 
//				
//				Input: “James” 
//				Output: “James” 
//				
//				Input: “concept map”
//				Output: print: “Invalid data” return value: “”
	
	public static void main(String[] args) {
		String w = "concert";
		System.out.println(remove3letters(w, "nce"));
	}
	
	// Write a method Part II.
	// Method should accept 2 Strings. 
	//1 - data. 2 - String we want to remove(3 letters)
	// Every single rules for previous version is same for this method too. 
	public static String remove3letters(String word, String letters) {
		word = word.toLowerCase().trim();
		if(word.contains(" ") || word.length() < 3) {
			System.out.println("Invalid data");
			return "";
		}
		if(word.contains(letters)) {
			return word.replace(letters, "");
		}else {
			return word;
		}
	}
	
	
	public static String removeCon(String word) {
		word = word.toLowerCase().trim();
		if(word.contains(" ") || word.length() < 3) {
			System.out.println("Invalid data");
			return "";
			
		}
		if(word.contains("con")) {
			String s = word.replace("con", "");
			return s;
		}else {
			return word;
		}
	}
}


