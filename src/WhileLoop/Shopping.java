package WhileLoop;

import java.util.Scanner;

public class Shopping {
	
	
								// TASK:
	// Write a program that keeps asking for the transaction amount from user while user
	//has sufficient amount of money.
	//variables: balance, transactionAmount
	//Flow:
	//Please enter transaction amount:
	// >200
	//Please enter transaction amount:
	//>300
	//Please enter transaction amount:
	//>100
	//You are broke!
	
	public static void main(String[] args) {
		int balance = 1500;
		int transactionAmount;
		String itemName;
		Scanner input = new Scanner(System.in);
	
		
		while(balance > 0) {
			System.out.println("Please enter transaction amount:");
			transactionAmount = input.nextInt();
			input.nextLine(); // 25 34 45  --> 253445 ->read one line
		
			System.out.println("Please enter item name:");
			itemName = input.nextLine();
			if(balance < transactionAmount) {
				System.out.println("Transaction amount is too high. Try different amount.");
				continue;
			}
			if(itemName.equalsIgnoreCase("ak-47")) {
				System.out.println("Illegal item");
				break;
			}
			balance -= transactionAmount;
			System.out.println(itemName + " purchased successfully");
		}

		if(balance == 0) {
			System.out.println("You are broke");
			System.out.println("Your balance: " + balance);
		}
		
	}
}