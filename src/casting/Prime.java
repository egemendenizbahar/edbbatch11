package casting;

public class Prime {
	public static void main(String[] args) {
		
		
	String s = "54.2";
	double d = Double.valueOf(s);
	int i = (int)d;				//explicit casting
	short ss = 5;
	int ii = (int)ss;
	System.out.println(i);
	}

}
