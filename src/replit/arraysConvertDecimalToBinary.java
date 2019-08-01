package replit;

import java.util.Arrays;
import java.util.Scanner;

public class arraysConvertDecimalToBinary {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int dec = in.nextInt();
				
		
		int[] bin = new int[8];
		
		int check = 128; 
		
		for(int i = 0 ; i < bin.length; i++) {
			if(dec >= check ) {  
				bin[i] = 1;
				dec -= check;
				
			}else {
				bin[i] = 0;
			}
			
			check /= 2;
			
		}
		
		System.out.println(Arrays.toString(bin));
	}
}
