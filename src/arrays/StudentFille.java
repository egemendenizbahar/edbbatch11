package arrays;

import java.util.Arrays;

public class StudentFille {
	
//				Task
	//print the names that has the length of 5.
		//print all the names but empty lines
		//2. Write a program that stores all the names to the array. 
		//After storing the names into an array print out the values using Arrays toString.
		//Note: ignore the white space

	public static void main(String[] args) {
		
		//split() - >splits the string with given character and return String array.
		
		String s = "Heloo people";
				String words[] = s.split(" ");
		String[] words2 = {"Hello", "people"};
		System.out.println(Arrays.toString(words2));
		System.out.println(Arrays.toString(words));
	}

}
