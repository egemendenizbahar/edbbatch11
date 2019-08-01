package multidimensionalarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TwoIntegerTaskThree {

//	3. Write a method that accepts 2 integers. First integer is for outer array 
//	and second integer is for inner array size. Method should create two 
//	dimensional array and assign random numbers up to 100 and return two 
//	dimensional array back to user. 

	public static void main(String[] args) {
		int[][] n = getMultiArray(2, 1);
		System.out.println(Arrays.deepToString(n));
		System.out.println();
		studentNames();
	}

	public static int[][] getMultiArray(int size1, int size2) {
		int[][] numbers = new int[size1][size2];
		Random r = new Random();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = r.nextInt(100);
			}

		}
		return numbers;

	}


//	3. Write a program that creates two dimensional array of String and stores groups in it. 
//	Program should ask number of groups through scanner and sets the size of two dimensional array. 
//	Then program should ask number of students for each group. 
//	After specifying number of students for each group, 
//	it should also ask each names and store into inner arrays.
//	Flow:
//		Please enter the size of groups:
//			> 2
//		Please enter number of students for group 1:
//			> 3
//		Please enter student name 1:
//			> James
//		Please enter student name 2:
//			> John
//		Please enter student name 3:
//			> Adam
//		Please enter number of students for group 2:
//			> 4
//		Please enter student name 1:.........

	public static void studentNames() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the size of groups:");
		int size = input.nextInt();
		String[][] names = new String[size][];

		for (int i = 0; i < size; i++) {
			System.out.println("Please enter number of students for group " + (i + 1) + ":");
			int num = input.nextInt();
			input.nextLine();
			String[] hold = new String[num];
			for (int j = 0; j < num; j++) {
				System.out.println("Please enter student name " + (j + 1) + ":");
				hold[j] = input.nextLine();
			}
			names[i] = hold;
			System.out.println(Arrays.toString(names[i]));
		}

	}
}




















