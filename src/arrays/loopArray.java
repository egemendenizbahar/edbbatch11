package arrays;

public class loopArray {
	
	public static void main(String[] args) {
		
		
		String[] colors = {"blue", "yellow", "red", "grey"} ;
		
		int size = colors.length;
		
		for(int i=0; i< size; i++) {
			if(colors[i].length() >= 4) {
			System.out.println(colors[i]);
		}
	}


}}