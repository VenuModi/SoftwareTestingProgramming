package Övning5;
/*Bonus: Exceptiondetektiven
* Bestäm för varje kodrad om problemet upptäcks vid kompilering, under körning eller om raden är korrekt.
* Testkör efter att du gissat.
* - int age = 20;
* - int number = 10/0;
* - int[] values = new int[3];
* - System.out.println(values[3]);
* - double price = 19.95;*/

public class ExceptionDetective {

    public static void main(String[] args) {

        int age = 20;// Valid int

        int number = 10/0;//Runtime exception.

        int[] values = new int[3]; // Creates an array of length 3

        System.out.println(values[3]);//Runtime exception - Array index out of bound

        double price = 19.95; // valid double
    }
}
