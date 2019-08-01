package methods;

public class Calculater {
	
	//write a method that returns integer and takes 2 integers.
	//method should return sum of two integers.
	
	//same rules for subtrack, multiply, divede.
	
	public static void main(String[] args) {
		int num1 = 5040; int num2 = 12;
		
		System.out.println(num1 + "+" + num2 + " = " + add(num1,num2));
		System.out.println(num1 + "-" + num2 + " = " + subtrack(num1,num2));
		System.out.println(num1 + "*" + num2 + " = " + multiply(num1,num2));
		System.out.println(num1 + "/" + num2 + " = " + divede(num1,num2));
		
	}
	
	public static int add(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int subtrack(int num1, int num2) {
		return num1 + num2;
		
	}
	
	public static int divede(int num1, int num2) {
		return num1 / num2;
	}
	public static int multiply(int num1, int num2) {
		return num1 * num2;
		
	
	}
}
