package TASKS;

import java.util.Scanner;

public class Tasks {

	/*Task 1. 
In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. Keep in mind aach instance must be printed on a new line, like sample input and output.

Input Format

There are three lines of input:

The first line contains an integer.
The second line contains a double.
The third line contains a String.


Output Format

There are three lines of output:

On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.

Sample Input:
42
3.1415
Welcome to Java tutorials!

Sample Output:

String: Welcome to Java tutorials!
Double: 3.1415
Int: 42

 

Task 2.


In this challenge, you must read an width and length as an integer, then calculate area and perimeter of rectangle and print the values according to sample input and output.

Sample Input:
Please enter width:
3
Please enter length:
4

Sample Output:
Area of rectangle: 12
Perimeter of rectangle: 14 */


	
	
	
	public static void main(String[] args) {
		int weight;
		double height;
		String name;
				
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your weight: ");
		weight = input.nextInt();
		System.out.println("Please enter your height: ");
		height = input.nextDouble();
		System.out.println("Please enter your name: ");
		name = input.next();
		
		System.out.println("Name: " + name);
		System.out.println("Height: " + weight);
		System.out.println("Weight: " + height);
		System.out.println();
		System.out.println("Task 2");
		
		
		//Height must be added as decimal. ex: 6.2
		
		
		int lenght, width;
		System.out.println("Please enter length: ");
		lenght = input.nextInt();
		System.out.println("Please enter widht: ");
		width = input.nextInt();
		System.out.println("Area of rectangle: " + lenght*width);
		
		System.out.println("Primeter of rectangle: " + 2*(width+lenght));
				
		
		
	}

}
