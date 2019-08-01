package foreachloop;

public class task3 {
	
//	TASK
	
//	Write a program that has String array called emails. 
//	Store 5 emails in the array. 
//	Loop through each email and print valid emails only. 
//	Valid email: email should contain “@“ and “.”.
	
	public static void main(String[] args) {
		
		String [] emails = {"assel.blablatova@gamil.com","deniz@gmail.com", "berkaygmail.com",
				"davidcan@gmail.com,", "kanat@gmsilcom"};
		
		for(String email : emails) {
			if(email.contains("@") && email.contains(".")) {
				System.out.println(email);
			}
		}
	}

}
