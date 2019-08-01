package casting;

import java.util.Scanner;

public class YearChanging {
	
//	TASK
	
//	"Pub;ished on Feb 12, 2018"
//	Write a program that cuts the year of the above String. 
//	Covert the year from String to integer and print “Valid year” if year is less 
//	than or equal to 2019, print “Invalid year” if year is more than 2019. 
//	Flow:  
//		Published on Feb 12, 2018 
//		> Valid year 
//		Published on Feb 12, 2021 
//		> Invalid year
	
	public static void main(String[] args) {
		
//		String str = "Published on Feb 12, 2020";
//		int i, year;
//
//		Scanner input = new Scanner(System.in);
//
//		i = str.lastIndexOf(' ') + 1;
//		str = str.substring(i);
//		year = Integer.valueOf(str);
//		if(year <= 2019) {
//			System.out.println("Valid year");
//		} else {
//			System.out.println("Invalid year");
//		}
		
		String s = "Pub;ished on Feb 12, 1999";
		int indexOfComma = s.indexOf(",");
		s = s.substring(indexOfComma+2);
		System.out.println(s);
		int year = Integer.valueOf(s);
		if(year<=2019) {
			System.out.println("Valid year");
		} else {
			System.out.println("Invalid year");
		}

		
	}

}
