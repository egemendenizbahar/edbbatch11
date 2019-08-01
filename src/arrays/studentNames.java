package arrays;

public class studentNames {
	
	public static void main(String[] args) {
		
		String[] students = {"James", "John", "Adam", "Elize", "Jamie", "Benzema"};

		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].charAt(0));
		}

		System.out.println();

		for(int j = 0; j < students.length; j++) {
			if(students[j].endsWith("s")) {
				System.out.println(students[j]);
			}
		}

		System.out.println();

		for(int k = 0; k < students.length; k++) {
			if(students[k].contains("e")) {
				System.out.println(students[k]);
			}
		}
		
	}

}
