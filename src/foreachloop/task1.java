package foreachloop;

public class task1 {
	
//	1.Write a program that compares two String arrays.
//	Create and initialize array of String called phones with values 
//	“Iphone, Samsung, LG, Google Pixel, Motorola”. 
//	Create second String array called phone2 with values 
//	““Iphone, Samsung, LG, Google Pixel, Motorola”. 
//	Program should print “Two arrays are same” if they are exactly same size and same values. 
//	Print “Two arrays are different” otherwise.
	
	public static void main(String[] args) {
		
//		String [] phones = {"Iphone", "Samsung", "LG", "Nokia"};
//        String [] phones2 = {"Iphone", "Samsung", "LG", "Nokia"};
//        int counter = 0;
//        if(phones.length == phones2.length) {
//            
//            for(int i = 0; i < phones.length; i++) {
//                String p = phones[i];
//                String p2 = phones2[i];
//                if(p.equals(p2)) {
//                    counter++;
//                }
//                
//            }
//        }else {
//            System.out.println("Arrays are different");
//        }
//        if(counter == phones.length) {
//            System.out.println("Arrays are same");
//        }else {
//            System.out.println("Arrays are different");
//        }
		
						//OR
		
	
		String[] phone = {"Iphone", "Samsung","LG","Google Pixel", "Motorola" };
		String [] phone2 = {"Iphone", "Samsung","LG","Google Pixel", "Motorola" };
		
		boolean same = true;
		
		
				if(phone.length == phone2.length) {
					for(int i = 0; i < phone.length; i++) { 
						if(phone[i] != phone2[i]) {
							same = false;
							break;
						}
					}
				
				} else {
					same = false;
				}
				if(same) {
					System.out.println("Two arrays are same.");
				}  else {
					System.out.println("Two arrays are different.");
				}
		
		
	}

}
