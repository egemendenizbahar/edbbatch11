package methods;

public class TaskThree {
	
//	Create a void method that accepts an integer and method 
//	should print out all the odd numbers  on same line space separated from 0 to given integer. 
//	Flow:      
//		input:printOdd(10);
//			Output:1 3 5 7 9
	
	public static void main(String[] args) {
		
			
			printOdd(10);
		}
		
		public static void printOdd(int limit) {
			
		for(int i = 0; i < limit; i++) {
		if(i % 2 == 1) {
			System.out.println(i + " ");
		}
	}

	}
	}
	
