package arrays;

import java.util.Arrays;

public class evenCollector {
	
	
	
//			TASK

//	2. Write a program called EvenCollector:
//	— Declare array nums and assign {1,2,-3,4,-34,55,78,90,33,10}
//	— Iterate through elements and find even numbers.
//	— Create array evens and store all the even numbers from nums array.
//	— Print the new array using toString method.
	
	public static void main(String[] args) {
		
			
			int[] numbers = {1,2,-3,4,-34,55,78,90,33,10};  
			int counter = 0;
			// Loop through numbers array and count even numbers
			for(int num: numbers)  {
				if(num % 2 == 0) {
					counter++;
				}
			} 
			//once we find even numbers we are creating array called evens
			System.out.println(counter);
			int[] evens = new int[counter];
			int i=0;
			//Loop through numbers again and find even numbers to store them into aray evens
			for(int num: numbers) {
				if(num%2==0) {
					evens[i] = num;
					i++;
				}
			}
			
			System.out.println(Arrays.toString(evens));
			
	}
}


