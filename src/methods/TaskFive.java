package methods;

public class TaskFive {
	
//	Create a method called reserveString. Method accepts one 
//	String and prints out the reversed version of it. 
//	Flow:
//		Input:reverseString(“James”);
//		Output:semaJ
	
	public static void main(String[] args) {
		
		reverseString("James");
		
	}
	
	public static void reverseString(String str ) {
		for(int i = str.length()- 1; i >= 0 ; i--) {
			System.out.println(str.charAt(i));
		}
	}

}
