package replit;

import java.util.Scanner;

public class arraysConvertBinaryToDecimal {
	public static void main(String[] args) {
		
	
		    Scanner input = new Scanner(System.in);
		    
		    int decimal = input.nextInt();
		    int[] binary = new int[8];
		    
		    //TO DO: Write your code below.
		  
				
				int dec = input.nextInt();
						
				
				int[] bin = new int[8];
				
				int check = 128; //ilkin 128 dene, 35'ten buyuk. else gec. 0 koy.
								//sonra ikiye bol. 64, 35'ten buyuk, yine 0 koy ve ikiye bol.
								//36 
				
				for(int i = 0 ; i < bin.length; i++) {
					if(dec >= check ) {  //
						bin[i] = 1;
						dec -= check;
						
					}else {
						bin[i] = 0;
					}
					
					check /= 2;
					
				}
				
				System.out.println((bin));
			}

		    }

