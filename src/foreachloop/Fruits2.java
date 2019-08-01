package foreachloop;

public class Fruits2 {
	
	public static void main(String[] args) {
		
//		TASK
//		Print fruit if length of the fruit is even.
		
		String [] favoriteFruits = {"Orange", "Apples", "Pineapple", "Mango"};
		
		for(String fruit: favoriteFruits) {
	
			if(fruit.length() % 2 == 0) {
			System.out.println(fruit);
		
		
	}

}

	}
}