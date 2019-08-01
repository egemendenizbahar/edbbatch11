package methods;

import java.util.Random;

public class TaskfFour {

	
//	4. Create a method called createUsername that 2 Strings. 1 - first name 2 - last name.
//	Method should convert both firstName and lastName to lower 
//	case and it should concatenate and add random number 
//	between 0 - 100. Print generated username in the end.
//	Flow: Input:createUsername(“James”, “Bond”);
//	Output: jamesbond47
	
	public static void main(String[] args) {
		
		createUsername("James", "Bond");
		
	}
	public static void createUsername(String FirstName, String LastName) {
		Random random = new Random();
		System.out.println(FirstName.toLowerCase() + LastName.toLowerCase() + random.nextInt(100));
	}
}
