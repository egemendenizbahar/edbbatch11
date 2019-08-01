package methods;

public class GoogleResultTime {
	
	
	//returnType String
	//Accepts a string as parameter
	//String will be passed as google result count format
	//Print out only the time of search results
	
	public static void main(String[] args) {
		
		String result = "About 691,000,000 results (0.78 seconds)";
		System.out.println(resultTime(result));
		
	}
	
	public static String resultTime(String res) {
		String r = res.substring(res.indexOf("(") +1, res.length()-1);
		return r;

}

	
	

}
