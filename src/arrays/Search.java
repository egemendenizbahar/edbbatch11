package arrays;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		
//			TASK
//		Declare array and store elements
//		{43,23,6,-3,66}
//		Print out the index of -3 if it exists in the array.
		
		int[] nums = {43,23,6,-3,66};
		for(int i = 0; i <nums.length; i++) {
			if(nums[i] == 66) {
				System.out.println(i);
				break;
			}
		}
		
	}
}
	
		
		


