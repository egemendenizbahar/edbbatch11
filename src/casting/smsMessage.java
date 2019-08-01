package casting;

public class smsMessage {
	
	
//	Task 1:
//		Create a string variable SMSmessage, assign following value:
//			"Sender:<Mike Smith>. From Number:[202-123-3456]. "
//			+ "Message:{I love programing and problem solving}"
//			-Create 3 string variables:
//				sender, phoneNumber,message
//				- by using indexOf and substring methods,
//				retrieve related information from SMSmessage string and assign 
//				to those 3 variables.
//				-print each variable in separate line
	
	public static void main(String[] args) {
		
		String SMSmessage = "Sender:<Mike Smith>. From Number:[202-123-3456]. "
			+ "Message:{I love programing and problem solving}";
		String sender,phoneNumber,message;
		int a, b;
		a = SMSmessage.indexOf("<");
		b = SMSmessage.indexOf(">");
		sender = SMSmessage.substring(a,b);
		
		a = SMSmessage.indexOf("<") + 1;
		b = SMSmessage.indexOf(">");
		sender = SMSmessage.substring(a, b);
		
		a = SMSmessage.indexOf("[") + 1;
		b = SMSmessage.indexOf("]");
		phoneNumber = SMSmessage.substring(a, b);
		
		a = SMSmessage.indexOf("{") + 1;
		b = SMSmessage.indexOf("}");
		message = SMSmessage.substring(a, b);
		
		System.out.println(sender);
		System.out.println(phoneNumber);
		System.out.println(message);
		
		
		
		
		
	}

}
