package methods;

import java.util.Arrays;

public class ReplaceNegativeNumber {
	
//	Write a method that accepts integer array and integer.
//	Method should replace negative values with 
	
	public static void main(String[] args) {
		
		int[] arr = {23, -1,34};
		replaceNegative(arr,5);
		
		
	}
		
	
	public static void replaceNegative(int[] nums, int num) {
		for(int i = 0; i <nums.length; i++) {
			if(nums[i] < 0) {
				nums[i] = num;
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}
