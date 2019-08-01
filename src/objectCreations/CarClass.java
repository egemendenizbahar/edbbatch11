package objectCreations;

public class CarClass {
	
	public static void main(String[] args) {	
	
	
	Car car1 = new Car();
	car1.make = "BMW";
	car1.mileage = 50000;
	car1.sportEdition = true;
	car1.year = 2018;
	System.out.println(car1.mileage);
	car1.drive("Chicago");
	System.out.println(car1.mileage);
	car1.drive(1200);
	System.out.println(car1.mileage);
	car1.drive();
	System.out.println(car1.mileage);
}

}
