/*Övning 2 - Pizzakalkylatorn
* Skapa en metod som räknar ut vad en pizzabeställning kostar.
* Skapa metoden beraknaPris()
* Metoden ska ta emot antal pizzor och pris per pizza som parametrar.
* Metoden ska returnera det totala priset.
* Anropa metoden och skriv ut resultatet.
* Tränar på: parameterar, returnvärde och return.
*/

public class PizzaClaculator {
    public double beraknaPris (int antalPizzor, double PrisPerPizza){
        double totalPris = antalPizzor * PrisPerPizza;
        return totalPris;

    }
}
