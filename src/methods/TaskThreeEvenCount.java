package methods;

public class TaskThreeEvenCount {
	
//	TASK
//	Write a method that accepts integer arrays and returns integer.
//	Method should count even numbers and return count even numbers.
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,6,42,64};
		
		System.out.println(evenCounter(arr));
		
	}
	
	public static int evenCounter(int[] arr) {
		
		int counter = 0;
		for(int item : arr) {
			if(item % 2 == 0 ) {
				counter++;
			}
		}
		return counter;

}
}