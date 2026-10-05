/*Scope: Skapa en variabel inne i ett kodblock och testa vad som händer om du försoker använda den utanför blocket*/
public class ControlFlow {
    public static void main(String[] args) {
        /*If - Gör ett program som skriver ut ett meddelande om ett tal  är större än 10.*/
        int number  = 20;
        if (number > 10){
            System.out.println("The number is greater than 10");
        }

        /*If/else - Gör ett program som kontrollerar om en person är 18 år eller eldre.*/

        int age = 15;
        if (age >= 18){
            System.out.println("You are over 18 years old.");
        } else {
            System.out.println("You are under 18 years old.");
        }

        /*Else/If - Gör ett program som skriver ut olika meddelanden beroende på om tal är lite, mellan eller stort*/

        int tal = 25;
        if (tal < 10){
            System.out.println("Din tal är lite");
        } else if (tal <= 20 ) {
            System.out.println("Din tal är medium");
        } else {
            System.out.println("Din tal är stort");
        }

        /*Switch - Låt ett tal mellan 1 och 3 motsvara tre olika alternativ och skriv ut rätt alternativ.*/

        int choice = 1;
        switch (choice){
            case 1:
                System.out.println("Option 1");
                break;
            case 2:
                System.out.println("Option 2");
                break;
            case 3:
                System.out.println("Option 3");
                break;
            default:
                System.out.println("Option Invalid!");
        }

        /*While - Skriv ut talen 1-5 med en while loop*/

        int num = 1;
        while (num <= 5){
            System.out.println(num);
            num++;
        }

        /*Do-while - Skriv ut ett meddelande minst en gång med en do-while loop*/

        int nos = 10;
        do {
            System.out.println("Hello");
            nos++;
        }while (nos < 20);

        /*For-loop - Skriv ut talen 1 till 10 med en for-loop*/

        for (int numbers = 1; numbers <=10; numbers++){
            System.out.println(numbers);
        }

        /*Break - Gör en loop som avbryts när räknaren nåt ett vis tal.*/

        for (int i = 1; i <= 10; i++){
            if (i == 2){
                break;
            }
            System.out.println(i);
        }

        /*Continue - Gör en loop som hoppar över en viss tal.*/

        for (int a = 1; a <=20; a++){
            if (a == 6){
                continue;
            }
            System.out.println(a);
        }
    }
}
