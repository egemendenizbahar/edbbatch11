package ifelsestatements;

import java.util.Scanner;

public class Sandra {

	public static void main(String[] args) {
		//1 - lobby, 2- google, 3 - apple, 4- cybertek
		Scanner input = new Scanner(System.in);
		int floor;
		System.out.println("Which floor?");
		floor = input.nextInt();
		
		
		switch (floor) {
		case 1:
			System.out.println("Lobby");
		case 2:
			System.out.println("Google");
		case 3:
			System.out.println("Apple");
		case 4:
			System.out.println("Cybertek");
		break;
		default:
			System.out.println("No such floor");
	}
	}
}
