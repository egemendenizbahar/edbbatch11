package inheritance;

public class Education {
	
	public static void main(String[] args) {
		CodingBootcamp cb = new CodingBootcamp();
		cb.name = "Cybertek";
		cb.address = "2700 S River Rd";
		cb.hostEvent("May 11, 2019");
		CybertekStudent cs = new CybertekStudent();
		cs.name = "James";
		cs.study("Java");
		OnlineStudent os = new OnlineStudent();
		os.name = "Adam";
		os.takeExam(85);
		System.out.println(os.grade);
		
		
	}

}
