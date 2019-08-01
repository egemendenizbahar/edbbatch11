package swichstatement;

import java.util.Scanner;

public class UnderstandingBoolean {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name, response;
		boolean currentStudent;
		
		System.out.println("Please enter your name:");
		name = input.nextLine();
		System.out.println("Are you a student currently?\nyes/no");
		response = input.nextLine();
		
		if(response.equals("yes")) {
			currentStudent = true;
			
		}else {
			currentStudent = false;
					

		}
		System.out.println("Name: " + name);
		System.out.println("Current student: " + currentStudent);
		
		if(currentStudent) {
			System.out.println(name + " you rock!");
			
		} else {
			System.out.println(name + "," + " you suck!");
			}
		}
		}

		
		//if user says yes currentStudent value should be true
		//if no then currentStudent value should be false
		
		


