package arrays;

import java.util.Arrays;

public class TwoMax {
	
//			TASK
//	
//	2. Write a program TwoMax. Create an integer array and store 
//	elements {23,1,34,3,54,54,51}
//	Your program should find two biggest values within an array.
//	Flow:
//		From above array it should print
//		54
//		51
//		
//		Note: If Max number is duplicate you should take second biggest value.
	
	public static void main(String[] args) {
		
		int[] numbers = {23,1,34,3,54,54,51};
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		int last = numbers.length -1;
		System.out.println(numbers[last]); //istedigimizin birini bulduk.
		
		for(int i = last; i >= 0; i--) {
			if(numbers[last] != numbers[i]) {
			System.out.println(numbers[i]);
			break;
		}
	}

	}
}
