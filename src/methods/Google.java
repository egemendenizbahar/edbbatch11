package methods;

public class Google {
	
	//print out only the count of search results.
	
	//input - >About 691,000,000 results (0.78 seconds)
	//output - >691000000
	
	public static void main(String[] args) {
		
		String result = "About 691,000,000 results (0.78 seconds";
		String count = resultCount(result);
		System.out.println(count);
		
	}
	
	public static String resultCount(String res) {
		String [] words = res.split(" ");
		String s = words[1];
		s = s.replace(",", "");
		return s;

}
}