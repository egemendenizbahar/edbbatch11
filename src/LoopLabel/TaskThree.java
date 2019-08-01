package LoopLabel;

import java.util.Random;

public class TaskThree {
	
//				TASK
//	Write a program that generates unique 6 digit random numbers using Random. 
//	When you run the loop and generate random number it shouldn’t generate same number.
//	Flow:
//		498217
	
	public static void main(String[] args) {
		
		Random r = new Random();
		String result = "";
		for(int i = 0; i < 6; i++) {
			int ii = r.nextInt(10);
			//While result contains the ii keep generating new ii.
			while(result.contains(ii + "")) {
				ii = r.nextInt(10);
				
			}
				result+=ii;
		}
		
			System.out.println(result);
			
		}

		
	}


