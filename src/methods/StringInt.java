package methods;

import java.util.Scanner;

public class StringInt {
	
//	Write a method that accepts String and int.
//	Check if string length is same as given integer.
//	Print "Equal" if they are equal. Print "Not equal"
//	if string length and given integer are not equal.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter name: ");
		String name = input.next();
		checkLength("hello" , 8);

}
	public static void checkLength(String word, int number) {
		if(word.length() == number) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}
}