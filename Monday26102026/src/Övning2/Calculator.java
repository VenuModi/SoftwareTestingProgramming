package Övning2;
/*2. Den säkra miniräknaren
* Gör ett litet program där användaren skriver in två heltal och programmet dividerar det första med det andra.
* - Använd Scanner för inmätningen.
* - Fånga ArithmeticException om användaren skriver något som inte är ett heltal.
* - Programmet ska skriva ett tydligt meddelande i stället för att krascha.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter first number");
            int number1 = scanner.nextInt();

            System.out.println("Enter second number");
            int number2 = scanner.nextInt();

            int result = number1 / number2;

            System.out.println("Result: " + result);
        }catch (ArithmeticException e){
            System.out.println("Division by Zero is not allowed!!");
        }catch (InputMismatchException e){
            System.out.println("Please enter whole numbers only!");
        }

        scanner.close();
    }
}
