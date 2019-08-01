package multidimensionalarray;

import java.util.Arrays;

public class twoDimensionalArrayIntTaskTwo {


	private static int maxSum;

//	2. Create void method that accepts two dimensional integer array and 
//	prints out inner array that has highest sum. 
//	Input —> { [4,2,6,45,23,1], [22,34,66], [1,2,3] }
//	Output —> [22,34,66] -> inner array that has highest sum.

	public static int[] highestSum(int[][] nums) {
		int maxSum = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = 0; j < nums[i].length; j++) {

				sum += nums[i][j];
			}
			if (sum > maxSum) {
				maxSum = sum;
				index = i;
			}
		}
		System.out.println(Arrays.toString(nums[index]));
		return nums[index];

	}

}
