package Övning1;
/*1. Läs innan du kör
* Läs koden nedan. Försök först att förutsäga vad som skrivs ut och hur kön förändras.
* Skriv ned vad ni trir att de fyra utskrifterna blir. Vad är skillnaden mellan peek() och poll()?
* Får samma namn finnas flera gånger i en Queue?
*/

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> ko = new LinkedList<>();//Allows duplicates

        ko.offer("Kim");
        ko.offer("Alex");
        ko.offer("Kim");

        System.out.println(ko.peek());//returns Kim without removing her.
        System.out.println(ko.poll());//returns kim and removes the first Kim
        System.out.println(ko.size());//returns 2 because Alex & second Kim remain.
        System.out.println(ko);//displays [Alex, Kim]
    }

}
