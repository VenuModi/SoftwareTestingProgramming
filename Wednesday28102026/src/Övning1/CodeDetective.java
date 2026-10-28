package Övning1;
/*1. Koddetektiven - vad betyder egentligen x?
* Koden fungerar, men namnen berättar nästan ingenting. Byt namn på variablerna så att koden blir begriplig
* utan extra kommentarer.

String x = "Mira";
int y = 3;
double z = 30.0;
double a = y * z;

System.out.println(x + " köper drycker för " + a + " kr.");

Byt ut x, y, z och a mot tydliga namn.
Kör programmet före och efter. Utskriften ska fortfarande betyda samma sak.
Jämför med en klasskamrat: valde ni samma namn? Om inte, vilket namn är tydligast?
*/

public class CodeDetective {

    public static void main(String[] args) {

        String customerName = "Mira";
        int numberOfDrinks = 3;
        double pricePerDrink = 30.0;
        double totalPriceForDrinks = numberOfDrinks * pricePerDrink;

        System.out.println(customerName + " köper drycker för " + totalPriceForDrinks + "kr.");
    }
}
