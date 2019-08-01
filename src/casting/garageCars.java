package casting;

public class garageCars {

//	Task 2:
//		Contains method:
//			-Create a String variable garage and
//			Assign following string:
//				"Toyota, Nissan, Honda, BMW, Mazerati, Ford"
//				-convert whole garage into lowercase letters
//				-if garage isEmpty print "no cars in garage"
//				-using contains method check:
//					-if garage contains "toyota" or "nissan"
//					print "There is a Japanese car in garage"
//					if not print "No Japanese cars"
//					-if garage has "bmw"print "there is a german car in garage"
//					if not print "no german cars"
//					-if garage has "Mazerati"print "there is an italian car in garage"
//					if not print "no italian cars"
//					- if garage has "jaguar"
//					print "there is an british car in garage"if not print "no british cars"

	public static void main(String[] args) {
		
String garage = "Toyota, Nissan, Honda, BMW, Mazerati, Ford";
		
		garage = garage.toLowerCase();
		
		if(garage.isEmpty()) {
			System.out.println("No cars in garage");
		} else {
			if(garage.contains("toyota") || garage.contains("nissan")) {
				System.out.println("There is a Japanese car in garage");
			} else {
				System.out.println("No Japanese cars");
			}
			
			if(garage.contains("bmw")) {
				System.out.println("There is a German car in garage");
			} else {
				System.out.println("No German cars");
			}
			
			if(garage.contains("mazerati")) {
				System.out.println("There is an Italian car in garage");
			} else {
				System.out.println("No Italian cars");
			}
			
			if(garage.contains("jaguar")) {
				System.out.println("There is a British car in garage");
			} else {
				System.out.println("No British cars");
			}
		}





		
		
		
		
	}

}
