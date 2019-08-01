package arrays;

public class nurdinTask1 {
	
	public static void main(String[] args) {
		
		
		String [] names = {"ada","dinara","assel","david","berkay","vera","nora","pera","aydan","sofia"};
			int count = 0;
			String firstTwoLetters = "";
			for (int i = 0; i < names.length; i++) {
				if(names[i].startsWith("A") || names[i].startsWith("a")) {
					count++;
					firstTwoLetters += names[i].substring(0,2) + " ";
				}
			}
			System.out.printf(String.format("Count is: %s" + " and first two letters are : %s", count, firstTwoLetters));
	}

}
