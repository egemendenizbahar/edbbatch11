package ifelsestatements;

import java.util.Scanner;

public class groupStudy {

		  public static void main(String[] args) {
		    
		    
		    // Task 1
		    int unitPrice;
		    int quantity;
		    double grandTotal=0.0;
		    int discount=0;
		    double discountApplied=0.0;
		    double total=0.0;
		   
		    Scanner input = new Scanner(System.in);
		    
		    System.out.println("Enter unit price:");
		    unitPrice = input.nextInt();
		    
		    System.out.println("Enter quantity:");
		    quantity = input.nextInt();
		    
		    // your code here. (DO NOT change existing code)
		    //----------------------------------------------

		    grandTotal = (unitPrice * quantity);
		    discountApplied = grandTotal * (discount/100);
		    total = grandTotal - discountApplied;
		    
		    if (quantity < 100){
		      
		      discount = 0;
		      
		      
		    }else if(quantity >=100 && quantity <=120){
		      
		      discount = 10;
		      
		      
		    }else{
		      
		      discount = 15;
		      
		    }
		      
		      System.out.println("Grand total: $" + grandTotal);
		      System.out.println("Discount: " + discount + "%");
		      System.out.println("Discount applied: $" + discountApplied);
		      System.out.println("Total: $" + total);
		      
		    }

	
	
	
	
	
}
