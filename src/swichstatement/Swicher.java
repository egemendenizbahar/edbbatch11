package swichstatement;

public class Swicher {
	
	
	public static void main(String[] args) {
			
		String name = "John";            
		
		switch(name) {
		
		case "James":
			System.out.println("James is a cool name");
			break;

		case "Jamie":
			System.out.println("Jamie is a okay name");
		
		case "John":
			System.out.println("John Wick??");
			break;
		
		default:
			System.out.println("Everything else");
	
		
		}
		
		
		// Convert same logic to if-else statement.
		
		
		if(name.equals("James")) {
			System.out.println("James is a cool name");
		}
		else if(name.equals("Jamie")){
			System.out.println("Jamie is okay name");
		}
		
		else if(name.equals("Jhon")){
			System.out.println("John Wick??");
		}
		else {
			System.out.println("Evrything else");
	}
	
}	
}