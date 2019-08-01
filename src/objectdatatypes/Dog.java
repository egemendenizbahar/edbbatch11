package objectdatatypes;

public class Dog {
	
	
	
	String breed;
	int age;
	String gender;
	String color;
	
	public void bark() {
		System.out.println("Dog is barking");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
	}

}


