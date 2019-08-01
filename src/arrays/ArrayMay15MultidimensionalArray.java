package arrays;

import java.util.Random;

public class ArrayMay15MultidimensionalArray {

	public static void main(String[] args) {

		int[][] mdArray = { { 21, 43, 43, 65, 63 }, { 23, 21, 43, 56, 86 }, { 21, 42, 54, 65, 76 },
				{ 11, 23, 68, 90, 99 } };
		
		printArray(mdArray, 2,2);

//		for (int row = 0; row < mdArray.length; row++) {
//
//			for (int col = 0; col < mdArray[row].length; col++) {
//				
//				System.out.print(mdArray[row][col] + "\t");
//			}
//				System.out.println(""); 

//		}

	}
	
	public static void printArray(int[][] mdArr, int row, int col) {
		System.out.println("The element at the row " + row + " column " + col + " is: " + mdArr[row][col] );
		
	}
}