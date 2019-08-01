package arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class namesFile {
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("test.txt");
		Scanner sc= new Scanner(file); 
		int counter = 0;
		while(sc.hasNextLine()) {
			String name = sc.nextLine().trim();
//			if(name.length() == 5) {
//				System.out.println(name);
//			}

			if(name.length() > 0) {
//				System.out.println(name);
				counter++;
			}
		}
	
	}
}