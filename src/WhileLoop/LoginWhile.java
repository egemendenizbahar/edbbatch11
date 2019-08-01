package WhileLoop;

public class LoginWhile {
	
	public static void main(String[] args) {
		
		int counter = 0;
		while(5 > 4) {
			System.out.println("Hello! - " + counter);
			if(counter == 4) {
				break;
			}
			counter++;
			
		}
	}

}
