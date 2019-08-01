package multidimensionalarray;

import java.util.Random;

public class randomNumbers {
	
	public static void main(String[] args) {
		int[][] nums= new int[4][5];
		Random random = new Random();
		
		for(int i = 0; i < nums.length; i++) {
			for(int j=0; j < nums[i].length; j++) {
				nums[i][j] = random.nextInt(100);
				System.out.printf("%-6d", nums[i][j]);
			}
			System.out.println();
		}
		
		int sum = 0, max = 0;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j=0; j < nums[i].length; j++) {
				sum += nums[i][j];
			}
			if (sum > max) {
				max=sum;
			}
			sum=0;
		}
		System.out.println();
		System.out.println(max);
		
		
		
		
		}
	}


