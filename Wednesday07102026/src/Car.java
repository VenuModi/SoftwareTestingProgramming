/*Constructors
* 3. Car class
* Create a Car class with the following properties:
* make(String), model(String), Year(int), and color(String).
* Implement multiple consturctors, including a parameterized constructor and constructor chaining.
* Create instances of the Car class using different constructors and print the details.
*/

public class Car {
    String make;
    String model;
    int year;
    String color;

    public Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;


    }
}
