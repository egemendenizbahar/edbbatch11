package objectCreations;

public class Person {
	
	
	String name;
	int age;
	String gender;
	//name that is declared within the method is called local variable.
	//name that is declared inside the class is called instance variable.
	
	public void talk() {
		String name = "James";
		System.out.println(name);
		System.out.println(this.name); //buna this yazamamizin sebebi yukarda da iki tane name string olmasi.
		System.out.println(gender);		//this yukaridaki name'i cagirmak icin.
	}

}
