package Övning3;
/*3. Finally - Städpatrullen
* Utgå från miniräknaren ovan. Lägg till ett finally-block som alltid skriver:
* System.out.println("Programmet är klart.")
* Testa minst tre gånger: korrekt inmatning, division med o och del typ av inmatning. När körs finally?
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class UpdatedCalculator {

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

        }finally {
            System.out.println("Programmet är klart.");

            scanner.close();
        }
    }
}
