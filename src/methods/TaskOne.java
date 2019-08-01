package methods;

public class TaskOne {
	
//	1.Create a void method that prints odd numbers from 0 - 50.
//	Flow:
//		Input:
//			printOdd50( );   
//				Output:    1 3 5 7 ...
	
	public static void main(String[] args) {
		
		printOdd50();
	}
	
	public static void printOdd50() {
		
	for(int i = 0; i < 50; i++) {
	if(i % 2 == 1) {
		System.out.println(i + " ");
	}
}

}
}