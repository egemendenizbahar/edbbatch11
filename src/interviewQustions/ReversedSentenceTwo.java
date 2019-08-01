package interviewQustions;

public class ReversedSentenceTwo {
	
	//Create a method that takes an integer number as an argument and 
	//prints prime numbers between 0 and number.
	//USE helper method.
	
	//EX:
	//input:
	//20
	//output:
	// 2 3 5 7 11 13 17 19
	
	public static void main(String[] args) {
        
        displayPrimeNumbers(90);
        
    }
	
	public static void displayPrimeNumbers(int num) {
		// 0 - 20
		for (int i = 0; i <= num; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}

	public static boolean isPrime(int num) {

		if (num < 2) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
