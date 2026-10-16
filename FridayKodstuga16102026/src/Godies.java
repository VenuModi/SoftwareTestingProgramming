/*Övning 2 - Godiesräknaren
* Skapa en metod som heter raknaPris.
* - Metoden ska ta emot antal godiesbitar och pris per bit som parametrar.
* - Metoden ska returnera det totala priset.
* - Anropa metoden och skriv ut resultatet.
* Extra utmaning: Skapa en överlagrad version av metoden som bara tar emot antal godisbitar och använder
* ett fast pris på 2 Kr per bit.*/

public class Godies {

    public double raknaPris(int numberOfCandies, double price){

        double total = numberOfCandies * price;

        return total;
    }

    public double raknaPris(int numberOfCandies){

        return numberOfCandies * 2.0;
    }
}
