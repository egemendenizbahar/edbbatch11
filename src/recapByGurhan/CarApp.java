package recapByGurhan;

public class CarApp {

    public static void main(String[] args) {

        Vehicle hatcback = new Vehicle();

        hatcback.year = 2011;
        hatcback.brand = "Lexus";
        hatcback.model = "Lux";
        hatcback.miles = 100000;
        hatcback.price = 15000;

        Vehicle suv = new Vehicle();

        suv.year = 2012;
        suv.brand = "BMW";
        suv.model = "X5";
        suv.miles = 111000;
        suv.price = 50000;

        Vehicle sedan = new Vehicle();

        sedan.year = 2013;
        sedan.brand = "Toyota";
        sedan.model = "Camry";
        sedan.miles = 20000;
        sedan.price = 10000;


        Vehicle truck = new Vehicle();

        truck.year = 2019;
        truck.brand = "BMC";
        truck.model = "tandra";
        truck.miles = 33000;
        truck.price = 122000;

        Vehicle [] vehiclesArr = {hatcback, suv, sedan, truck};

        System.out.println("All vehicles in the lot: ");

        for(int i = 0; i < vehiclesArr.length; i++) {
            System.out.println("======================");
            System.out.println("Brand\t: " + vehiclesArr[i].brand);
            System.out.println("Year\t: " + vehiclesArr[i].year);
            System.out.println("Miles\t: " + vehiclesArr[i].miles);
            System.out.println("Model\t: " + vehiclesArr[i].model);
            System.out.println("Price\t: " + vehiclesArr[i].price);
        }


    }
}
