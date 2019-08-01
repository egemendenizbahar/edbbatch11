package interviewQustions;

public class ReversedSentence {
	
	//Create a method takes String sentence as an paramater and return String sentence that 
	//only words are reversed.
	//USE helper method!!
	
	//Ex:
	//input:
	//Java is fun
	//Output:
	//avaj si nuf
	
	public static void main(String[] args) {
		String result = reverseWordsOnly("Java is fun");
		System.out.println(result);
	}

	public static String reverseWordsOnly(String sentence) {

		sentence = sentence.trim();
		// Java is fun
		String[] sen = sentence.split(" ");
		String result = "";
		for (int i = 0; i < sen.length; i++) {
			String word = sen[i];
			String reversed = reverse(word);

			result += reversed + " ";

		}
		return result.trim();
	}

	public static String reverse(String word) {
		word = word.trim();
		String result = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			result += word.charAt(i);
		}

		return result;
	}
}
