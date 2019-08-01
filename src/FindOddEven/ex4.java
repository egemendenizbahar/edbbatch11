package FindOddEven;

import java.util.Random;
import java.util.Scanner;

public class ex4 {

				//	TASK
//	Write a program to check if campus is open.
//	Ask from the user to enter the time
//	(in integer between 0 - 23). 
//	Declare boolean campusOpen variable. 
//	If user enters invalid time print “invalid time. 
//	Try again”. If user enters valid time then change 
//	campusOpen: Campus is open starting from 8 - 23:59. 
//	In the end print info in following format: 
//	Campus open: true 
//	Flow: Please enter the time to check campus hours. 
//	> 7 Campus open: false 
//	Please enter the time to check campus hours. 
//	> 15 Campus open: true
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean campusOpen;
		int time;
		System.out.println("Please enter time to check campus hours:");
		time = input.nextInt();
		if(time >= 0 && time <24) {
			
			if(time >= 8 && time <24){
				campusOpen = true;
		}
		else {
			campusOpen = false;
					
		}
			System.out.println("Campus open: " + campusOpen);
		}
		else {
			System.out.println("Invalid time. Try again later!");
		}
	}

}
