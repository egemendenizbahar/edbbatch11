package multidimensionalarray;

import java.util.Arrays;

public class Student {
	
	public static void main(String[] args) {
		String[][] groups = new String[3][];
		
		
		//TASK
		//Create 3 String arrays - 3 groups
		//1st array size of 2, 2nd array size of 5, 3rd array size of 4
		//Give names for all elements
		
		String [] team3 = {"Adam", "James"};
		String[] team2 = {"Berkay","David","Assel","Gabi","Mert"};
		String[] team1 = {"Halil","Ibrahim","Bahar","Derya"};
		groups[0] = team1;
		groups[1] = team2;
		groups[2] = team3;
		
		//groups[1][3] --> Gabi
//		System.out.println(groups[1][3]);
//		System.out.println(groups[2][0]);
//		System.out.println(groups[0][2]);
//		System.out.println();
		
		//print all teams using Arrays toString method.
		System.out.println(Arrays.toString(groups[0]));
		System.out.println(Arrays.toString(groups[1]));
		System.out.println(Arrays.toString(groups[2]));
		//System.out.println(groups.length);
		for(int i = 0; i < groups.length; i++) {
			System.out.println(groups[i].length);
		}
		
	}

}
