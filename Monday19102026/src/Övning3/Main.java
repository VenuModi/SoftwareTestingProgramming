package Övning3;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.drive();
        bicycle.drive();

        startTrip(car);
        startTrip(bicycle);
    }

    public static void startTrip(Drivable vehicle){
        vehicle.drive();
    }
}
