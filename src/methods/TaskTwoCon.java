package methods;

import java.util.Arrays;
import java.util.Random;

public class TaskTwoCon {
	
//	2. Create a method that takes integer(size), Integer(bound) and returns array of Integers.
//	Method idea: method should create list of integers and assign random numbers between zero to given bound. 
//	Size of array should be given size.
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(numbersGenerator(1, 199)));
	}
	public static int [] numbersGenerator(int size, int bound) {
		int[] arr = new int[size];
		Random random = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(bound);
		}
		return arr;
		
	}

}
