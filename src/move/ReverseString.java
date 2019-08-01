package move;
import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		
		//Write a program that reverses the String. Ask for a word from the user and 
		//reverse the word.
		
		//Flow:
		//Please enter the word;
//		>James
//		>semaJ
//		
//		Please enter the word:
//		>Hello
//		>olleH
//		
		Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word: "); 
        String word = input.nextLine();
        int lastIndex = word.length()-1;
        for(int i = lastIndex; i >= 0; i--) {
        	System.out.print(word.charAt(i));   //print"ln" kullanmadik sadece print kullandik
        	
        
		
		
        }
		
		
	}
}