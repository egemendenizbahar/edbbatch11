package arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TaskStudentFileOne {
	
	//				Task
	//print the names that has the length of 5.
		//print all the names but empty lines
		//2. Write a program that stores all the names to the array. 
		//After storing the names into an array print out the values using Arrays toString.
		//Note: ignore the white space
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("test.txt");
		Scanner sc=new Scanner(file);
		String result = "";
		while(sc.hasNextLine()){
			String name = sc.nextLine().trim();
			if(name.isEmpty()) {
				continue;
			}
			result += name + ",";
		}
		System.out.println(result);
		String[] studentList = result.split(",");
		System.out.println(Arrays.toString(studentList));

	}
		
	}


