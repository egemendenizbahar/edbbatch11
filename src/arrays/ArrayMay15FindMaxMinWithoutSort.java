package arrays;

import java.util.Arrays;

public class ArrayMay15FindMaxMinWithoutSort {
	
	public static void main(String[] args) {
		
		int [] grades = {15,25,33,35,66,44,78,95,98,1,501};
		
		int maxValue = grades[0];
		int minValue = grades[0];
		
		for(int i = 0; i < grades.length; i++) {
			if(maxValue < grades[i]) {
				maxValue = grades[i];
			}
			if(minValue > grades[i]) {
				minValue = grades[i];
			}
		}
		
		System.out.println("Max Value: " + maxValue);
		System.out.println("Min Value: " + minValue);
		
//		Arrays.sort(grades);
//		
//		System.out.println("Min grade is: " + grades[0]);
//		System.out.println("Max grade is: " + grades[grades.length-1]);
//	
	}
	
	

}
