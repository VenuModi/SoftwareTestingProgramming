package Övning3;
/*3. Metodkirurgen
* Metoden nedan räknar både ut priset och bestämmer vad som ska skrivas ut. Dela upp den i mindre metoder med tydliga namn.

static void shop() {
    int coins = 100;
    int numberOfPotions = 2;
    int totalCost = numberOfPotions * 30;

    if (coins >= totalCost) {
        System.out.println("Köpet lyckades. Kostnad: " + totalCost + " coins.");
    } else {
        System.out.println("Du har inte tillräckligt med coins.");
    }
}

Skapa en metod som räknar ut kostnaden.
Skapa en metod som skriver ut resultatet av köpet.
Ge metoderna namn som beskriver vad de gör.
Bonus: gör även potion-priset till en namngiven konstant.
 */

import javax.management.MBeanAttributeInfo;

public class MethodSurgeon {

    static final int POTION_PRICE = 30;

    public static void main(String[] args) {
        shop();
    }

    //Controls the purchase
    private static void shop() {

        int coins = 100;
        int numberOfPortions = 2;

        int totalCost = calculateCost(numberOfPortions);

        printPurchaseResult(coins, totalCost);
    }

    //Returns 60 coins
    private static int calculateCost(int numberOfPortions) {
        return numberOfPortions * POTION_PRICE;
    }

    //Prints purchase result
    public static void printPurchaseResult(int coins, int totalCost) {

        if (coins >= totalCost) {
            System.out.println("Köpet lyckades kostnad: " + totalCost + "coins");
        } else {
            System.out.println("Du har inte tillräckligt med coins.");
        }
    }
}
