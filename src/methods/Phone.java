package methods;

public class Phone {
	
	public static void main(String[] args) {
		boolean b = isWeatherSunny("Sunday");
		System.out.println(b);
		
	}
	
	//return type method
	//method returns boolean type
	//method accepts String
	
	public static boolean isWeatherSunny(String day ) {
		if(day.equals("Monday")) {
			return true; //terminates the method
		}
		
		return false;
	}

}
