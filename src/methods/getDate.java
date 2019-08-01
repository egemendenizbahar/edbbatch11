package methods;


public class getDate {
	
//	TASK:
//		Write a method getDate that returns "April 13, 2019"
//		
//		Call the method from main method and print the returned value.
	
	public static void main(String[] args) {
		
		String m = getDate();
		System.out.println(m);
		String date = getDate();
		System.out.println(date);
		
	}
	public static String getDate() {
		return "April 13";
		

}
}