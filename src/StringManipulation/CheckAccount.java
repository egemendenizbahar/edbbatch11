package StringManipulation;

public class CheckAccount {
	public static void main(String[] args) {
		
		String s = "Account number: 255572ACCD";
		
		//Check if "number" is starting with upper case or lower case
		//print "Starts with lower case" if "Number"
		//print "Starts with lower case" if "number"
		
//		int i = s.indexOf("t") + 2; // ->0'dan baslayip sayildiginda account numberin baslangicini belirtiyor.
//		
//		if(s.charAt(i) == 'N') {
//				System.out.println("Start with upper case");
//		} else if(s.charAt(i) == 'n'){
//			System.out.println("Start with lower case ");
//		}
		
		
		//another way
		
		 int nIndex = s.indexOf(" ") + 1;
		 if(s.charAt(nIndex) == 'n') {
			 System.out.println("Start with lower case");
		 }else {
			 System.out.println("Start with upper case");
	 }
		
		
	}

}
