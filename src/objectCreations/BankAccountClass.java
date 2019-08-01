package objectCreations;

public class BankAccountClass {
	
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.accountNumber = 1234325654;
		ba.balance = 2400.30;
		ba.holderName = "Berkay Oncel";
		ba.type = "Checking";
		System.out.println(ba.balance);
		ba.deposit(200.50);
		System.out.println(ba.balance);
		ba.transfer(100.50);
		System.out.println(ba.balance);
		ba.info();
	}

}
