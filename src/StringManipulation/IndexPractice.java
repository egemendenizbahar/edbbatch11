package StringManipulation;

import java.util.Scanner;

public class IndexPractice {
public static void main(String[] args) {
	

//	String breed = "Huskeys";
//	int i = breed.indexOf('s', 3); 
//	//bu rakan 3.haneden sonra aramaya baslatmak icin.
//	System.out.println(i);
	
//}
//}
	
//Write a program that detects bad words
// heck, silly, idiot.
//ask from user to enter the message to send
//check if message contains above bad words.
//if message contains any of those words print
//"Message failed"
//otherwise print "Message sent"
//NOTE: you must use index of method.

Scanner input = new Scanner(System.in);
System.out.println("Please enter the message: ");
String message = input.nextLine().toLowerCase().trim();

int first = message.indexOf("heck");
int second = message.indexOf("silly");
int third = message.indexOf("idiot");

System.out.println(first + "," + second + "," + third);
if(first == -1 && second == -1 && third == -1) {
	System.out.println("Message failed!");

}
	
}

}