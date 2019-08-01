package interviewQuestions;

import java.util.Scanner;

public class PrimeNumber_ {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int num = input.nextInt();

		boolean a = false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				a = true;
				System.out.println(num + " is not a prime number!");
				break;
			}
		}
		if (!a) {
			System.out.println(num + " is prime a number!");
		}

	}

}
