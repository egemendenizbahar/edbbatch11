package objectCreations;

public class BankAccount {
	
	//TASK
	
//	Create a class BankAccountInstance variables: type, accountNumber, balance, holderName
//	Methods: 
//	deposit. Method accepts double and it doesn’t return anything. 
//	Method should simply print “%double is deposited to your account” 
//	and add given double to the balance.
//	transfer -> accepts double -> Method should print “%double $ is transferred from your account” 
//	and decrement balance by given amount. 
//	info -> Method doesn’t accept or return anything. 
//	It should simply print the information about the BankAccount as below format
//	Name: %holderName
//	Balace: %balance
//	Type: %type
//	Account Number: %accountNumber
	
	
		String type;
		double balance;
		int accountNumber;
		String holderName;
		
		public void deposit(double money) {
			System.out.println(money + " $ deposited to your account.");
			balance += money;
		}
		public void transfer(double ammount) {
			System.out.println(ammount + " $ is transferred from your account.");
			balance -= ammount;
		}
		public void info() {
			System.out.println("\nYour Bank Information");
			System.out.println("Name: " + holderName);
			System.out.println("Balance: " + balance);
			System.out.println("Type: " + type);
			System.out.println("Account Number: " + accountNumber);
		}

}
