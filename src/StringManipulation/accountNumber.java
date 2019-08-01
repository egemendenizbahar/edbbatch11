package StringManipulation;

public class accountNumber {
	
	public static void main(String[] args) {
		
		
		/*  TASK
		    Write a program that takes just account number (ONLY NUMBERS)
		    from the string in the format of below:
		    Note: Account length is 6 if account starts with 2. account length is 5
		    if account starts with 5.
		    ex: Your account number: 257389ACCD ->257389
		    ex: Your account number: 52317XYZ -> 52317
		    Hints: use indexOf, length, charAt, substring.   
		    
		    Task#1: Print "cool" if account starts with 2
		    print "not cool" if account starts with 5. */
		
			//Account number csn only start with 2 or 5.
		
		String s = "Your account number: 257389ACCD";
		int i = s.indexOf(":") + 2; // ->0'dan baslayip sayildiginda account numberin baslangicini belirtiyor.
		System.out.println(i);
		if(s.charAt(21) == '2') {
				System.out.println("Cool");
		} else {
			System.out.println("Not cool");
		}
		
		
		
		
	}
}
