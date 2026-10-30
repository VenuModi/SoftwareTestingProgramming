package Övning2;
/*2. Testa er hypotes
* Kör programmet. Jämför med era förutsägelser och försök förklara eventuella skillnader.
* Ändra ordningen på de tre offer() -anropen och testa igen.*/

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> ko = new LinkedList<>();

        ko.offer("Alex");
        ko.offer("Kim");
        ko.offer("Kim");

        System.out.println(ko.peek());
        System.out.println(ko.poll());
        System.out.println(ko.size());
        System.out.println(ko);
    }
}
