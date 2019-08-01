package StringManipulation;

public class AccountLength {
	public static void main(String[] args) {
		
		String s = "Account Number: 453453623";
		
		//Write a code that validates account number length.
		//Each account length must be 8.
		//print "Valid account length" if valid
		//print "Invalid account length" if invalid
		
//		int i = s.lastIndexOf(" ") + 1;
//		String substring = s.substring(i);
//		
//		if(substring.length() == 8) {
//			System.out.println("Valid account length");
//		
//		}else {
//			System.out.println("Invalid account length");
//		}
		
		int firstIndex = s.indexOf(";") + 2;
		String accountNumber = s.substring(firstIndex);
		
		if(accountNumber.length() == 8) {
		System.out.println("Valid account number length");
	}else {
		System.out.println("Invalid account number length");
		
		
//		String s = "Account Number: 453453623";
//		int i = s.indexOf(":") + 2;
//		String account = s.substring(i);
//		
//		int l = account.length();
//		boolean length = l == 8;
//		
//		if (length) {
//			System.out.println("Valid");	
//		}
//		else {
//			System.out.println("Invalid");
		
	}
		
	}

}
