/*1. Får du åka berg & dalbanan?
* - Skapa variabler för en person ålder och längd.
* - Använd of, elseif och else flr att avgöra om personen får åka.
* - Programmet ska skriva ut ett tydligt meddelande beroende på resultatet.
*/

import java.util.Scanner;

public class AmusementPark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: " );
        int age = scanner.nextInt();

        System.out.println("Please enter your height: " );
        double height = scanner.nextDouble();

        if (age >= 12 && height >= 140){
            System.out.println("You can ride!");
        }else if (age < 12){
            System.out.println("You are too young to ride!");
        }else {
            System.out.println("You are not tall enough to ride!");
        }
        scanner.close();
    }
}
