package StringManipulation;

public class PrintAccountNumber {
	public static void main(String[] args) {
		
		String s = "Your account number: 57389ACCD";
		//print only account number without letters
		//account numbers will be 5 digits if it starts with '5'
		//account numbers will be 6 digits if it starts with '2'
		//account number can only start with'2' or '5'
		
		
		
// 					another way
		
//		int i = s.indexOf(':') + 2;
//		String accountNumber = s.substring(i);
//		
//		if(accountNumber.charAt(0) == '5') {
//			System.out.println(accountNumber.substring(0,5));
//		}else {
//			System.out.println(accountNumber.substring(0,6));
		
		int indexOfFirst = s.indexOf(":") + 2;
		char firstDigit = s.charAt(indexOfFirst);
		String account;
		
		if(firstDigit == '2') {
			account = s.substring(indexOfFirst, indexOfFirst + 6);
	}
	else {
		account = s.substring(indexOfFirst, indexOfFirst + 5);
			
		}
	System.out.println("Account: " + account);
		
	}


}