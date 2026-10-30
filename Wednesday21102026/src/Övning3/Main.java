package Övning3;

/*3. Gör systemet användbart
* Utöka programmet så att en fjärde person kan ställa sig i kön. Skriv sedan ut vem som står först,
* betjäna två personer och skriv ut vilka som är kvar. Kontrollera att rätt person alltid betjänas först.
*/

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> ko = new LinkedList<>();

        ko.offer("Kim");
        ko.offer("Alex");
        ko.offer("Kim");
        ko.offer("Lara");

        //Check who is first
        System.out.println("First: " + ko.peek());

        //Serve two customers
        System.out.println("Serving: " + ko.poll());
        System.out.println("Serving: " + ko.poll());

        //Show remaining customers
        System.out.println("Remaining customers: " + ko);
    }
}
