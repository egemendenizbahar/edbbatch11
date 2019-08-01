package move;
import java.util.Scanner;

public class RacistPerson {
	
	public static void main(String[] args) {
		
		//Write a program named RacistPerson. Ask the name from the user and print "good job, %name"
		//except for the "James".
		
		Scanner input = new Scanner(System.in);
		
		for( ; ; ) {
			System.out.println("Please enter your name");
			String name = input.nextLine();
			if(name.equalsIgnoreCase("Konstantin")) {
				continue;
			}
			System.out.println("Good Job, " + name);
		}
		
		

	}

}
