package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMay15Divede {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcoame To Divede My Array");
		System.out.println("Enter a number that you will be the size of your array: ");
		int size = input.nextInt();

		int[] numbers = new int[size];
		System.out.println("Enter number for your array: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		System.out.println("The string value of your array is: " + Arrays.toString(numbers));
		System.out.println("The 1st half of array is: " + Arrays.toString(Arrays.copyOfRange(numbers, 0, numbers.length/2)));
		System.out.println("The 2nd half of array is: " + Arrays.toString(Arrays.copyOfRange(numbers, numbers.length/2, numbers.length)));

	}

}
