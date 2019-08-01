package objectCreations;

public class Apple {
	
		//Instance variables
		//all below variables belong to an object.
		
		int size;
		String type;
		String color;
		String taste;
		
		//Print out the information if it has same values.
		//how to check if it is null.
		
		public void info() {
		
		if (size != 0) {
			System.out.println("Size: " + size);
		}
		if (type != null) {
			System.out.println("Type: " + type);
		}
		if (color != null) {
			System.out.println("Color: " + color);
		}
		if (taste != null) {
			System.out.println("Taste: " + taste);
		}
		
		
			
		}
		

}
