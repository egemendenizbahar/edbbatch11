package FindOddEven;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter name 1:");
	    String name= sc.nextLine();
	    System.out.println("Please enter name 2:");
	    String name1= sc.nextLine();
	    boolean realitive = false;
	    int space = name.indexOf(" ");
	    int space1 = name1.indexOf(" ");
	    String lastname = name.substring(space+1);
	    String lastname2 = name1.substring(space1+1);
	     if (lastname.equals(lastname2)) {
	    	 System.out.println("Relative: "+ true);
	     }else {
	    	 System.out.println("Relative: "+ false);
	     }
		}

	
}

