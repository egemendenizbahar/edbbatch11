package arrays;

import java.util.Scanner;

public class studentNames2 {
	public static void main(String[] args) {
		
		String[] students = {"James", "John", "Adam", "Elize", "Jamie", "Benzama"} ;
		String keyword;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your keyword:");
		keyword = input.next().toLowerCase();

		for(int k = 0; k < students.length; k++) {
			if(students[k].toLowerCase().contains(keyword)) {
				System.out.println(students[k]);
			}
		}
		
	}

}
