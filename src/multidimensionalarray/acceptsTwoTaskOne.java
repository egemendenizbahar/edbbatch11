package multidimensionalarray;

public class acceptsTwoTaskOne {
	
//	1. Create void method that accepts two dimensional int array and 
//	prints out the Biggest integer element. 
//	Input —> { [4,2,6,45,23,1], [22,34,66], [1,2,3] } 
//	Output —> 66 -> biggest element in the array.
	public static void main(String[] args) {
		int[] [] n= {{4,2,6,45,23,1}, {22,34,66}, {1,2,3} };
		maxValue(n);
	}
	
	public static void maxValue(int [] [] nums) {
		
		int max = nums[0][0];
		//Smallest value that integer can hold.
		//Integer.minValue
		
		for(int i = 0; i < nums.length; i++) {
			for (int j=0; j < nums[i].length; j++) {
				if(nums[i][j] > max) {
					max = nums[i][j];
				}
			}
		}
		System.out.println("Max: " + max);

		
	}

}
