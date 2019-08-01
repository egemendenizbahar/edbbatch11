package arrays;

import java.util.Scanner;

public class IncrementArrayValues {
	
	
	
//				TASK
//	
//	1.Write a program called IncrementArrayValues:
//	1. Declare arraynumsand assign{1,2,3,4,5,6,7,8,9}2. 
//	Print out all values in single line separated by space:
//		1 2 3 4 5 6 7 8 9
//		3. Using a Loop write some code to do the following:
//			if the value is even - double it and assign back. 
//			If the value is odd - triple it and assign back.
//			4.Print out all values in single line separated by space:
//				3 4 9 8 15 12 21 16 27
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,7,8,9};
		
		for(int num: nums) {
			System.out.print(num + " ");
		
		}
		
		//Double the even value, triple the odd values.
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				nums[i] = nums[i] * 2;
			}else {
				nums[i] = nums[i] * 3;
			
			}
		}
		System.out.println();
		//Print values with space separated
		
		for(int num: nums) {
		
			System.out.print(num + " ");
		}
		
		
	}

}
