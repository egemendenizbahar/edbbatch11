package move;

public class NumberEnds3 {
	
	//IQ
	// Write a program that prints every single number
	//from 0 - 50. Skip the numbers that ends with 3, 13,23,33,43.
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 50; i++) {
			
//			if( i % 10 == 3) {
//				continue;
//			}
			
//			OR
			
			String s = i+"";
			if(s.endsWith("3")) {
				continue;
			}
				
				System.out.println(i);
				
		
	}

}
}