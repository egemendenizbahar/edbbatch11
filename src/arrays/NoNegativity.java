package arrays;

import java.util.Arrays;

public class NoNegativity {
	public static void main(String[] args) {
		
//		TASK
//		
//		3. Write a program called NoNegativity.
//		— create and assign numbers {1,2,-3,4,-34,55,78,90,33,10}
//		— Iterate though elements and replace negative numbers with 0(zero).
//		
		
		int[] numbers = {1,2,-3,4,-34,55,78,90,33,10};
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < 0) {
				numbers[i] = 0;
			}
		}
		int ii = 0;
		for(int num: numbers) {
			if(num < 0) {
				numbers[ii] = 0;
			}
			ii++;
		}
			System.err.println(Arrays.toString(numbers));
	}

}
