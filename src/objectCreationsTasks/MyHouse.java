package objectCreationsTasks;

import java.util.Scanner;

public class MyHouse {
	
	public static void main(String[] args) {
		
		House myHouse = new House();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter type of the house: ");
		myHouse.type = input.nextLine();
		System.out.println("Please enter addres: ");
		myHouse.address = input.nextLine();
		System.out.println("Please enter number of the rooms: ");
		myHouse.numOfRooms = input.nextInt();
		
		myHouse.info();
		
	}

}
