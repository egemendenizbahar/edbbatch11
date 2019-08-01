package SplitMethod;

public class WordCounterTwo {
	
	public static void main(String[] args) {
		
		String sentence = "Write a program that program a group of given size";
		
		String [] words = sentence.split(" ");
		
		int [] lengths = new int[words.length];
		

		
		for(int i = 0; i < words.length; i ++) 
		{
			String word = words[i]; 
			
			lengths[i] = word.length();
		}
		
		int max = 0;
		for(int number : lengths) {
			
			if(number > max) 
			{
				max = number; 
			}
		}
		
		for(int j = 0; j <= max; j ++) 
		{
			int length = j; 
			
			for(String word : words) 
			{
				if(word.length() == length) 
				{
					System.out.println(word);
				}
			}
		}
		
	}

}
