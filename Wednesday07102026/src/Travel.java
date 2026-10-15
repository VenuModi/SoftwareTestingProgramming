/*Creating & manipulating objects in Java
* Task -1 Create a Class Describing an Object
* Create a new Java file with a class that represents a physical object of your choice.
* 1. Declare three variables of three different types that are relevant to your chosen object.
* 2. Initialize these variables with reasonable values.
* */

public class Travel {
//    String destination = "Maldives";
//    int days = 6;
//    double priceInSek = 459000.90;

    /*Task - 6 Constructors*/

    String destination;
    int days;
    double priceInSek;

    public Travel(String destination, int days, double priceInSek){
        this.destination = destination;
        this.days = days;
        this.priceInSek = priceInSek;
    }
}
