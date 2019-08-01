package methods;

public class TaskTwo {
	
//	Create a method that welcomes people. 
//	Method should accept a string (name) and it should print out “Welcome, %name!”.
//	Flow:       
//		Input:welcome(“James”);
//	Output:Welcome, James!
	
	public static void main(String[] args) {
		 welcome("James");
	}
	
	
	public static void welcome(String name) {
		System.out.println("Welcome, " + name + "!");
		
	}
	

}
