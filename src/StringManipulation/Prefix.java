package StringManipulation;

public class Prefix {
	public static void main(String[] args) {
		String weather = "Really good";
		boolean check = weather.startsWith("Real");
//		System.out.println(check);

		boolean check2 = weather.endsWith("good");
//	System.out.println(check2);
		boolean b = weather.startsWith("ly", 4);
//	System.out.println(b);

		// Other way to do "CheckAccount"

		String s = "Your account number: 257389ACCD";

		boolean checkAccount = s.startsWith("2", 21);
		System.out.println(checkAccount);
		if (checkAccount) {
			System.out.println("Cool");
		} else {
			System.out.println("Not cool");
		}

	}

}
