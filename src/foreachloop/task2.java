package foreachloop;

public class task2 {
	
//						TASK
//	2.   Write a program that counts how many words are starting with upper case in the array. 
//	Create an array of String called groceries and initialize with values: 
//	“Bread, Cucumber, apples, orange, cookies, Cake”. 
//	Program should print “Total words starting with upper case: 3
	
	public static void main(String[] args) {
		
		String[] groceries = {"Bread", "cucumber","Apples", "orange", "cookies", "cake"} ;
		int counter = 0;
		for(String item : groceries) {
			if(item.charAt(0) > 64 && item.charAt(0) < 91) {
				counter++;
		}
		
	}
		System.out.println("Total words starting with upper case: " + counter);
}
}
