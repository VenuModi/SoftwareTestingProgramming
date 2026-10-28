package Övning4;
/*4. Mini-projekt - Potion Shop
* Bygg en liten potion-butik. Här får du kombinera namngivning, små metoder och ett objekt med tydligt ansvar.

Skapa en klass Player med name, health och coins.
Skapa en metod canBuyPotion(int price) som svarar på om spelaren har råd.
Skapa en metod buyPotion(int price) som drar coins.
Skapa en metod heal(int amount) som höjer health. Health ska inte gå över 100.
Skapa en metod printStatus() som visar spelarens status.
I main: skapa en spelare, försök köpa en potion och skriv ut status före och efter.
Clean Code-utmaning: försök skriva koden så att du inte behöver kommentarer som förklarar självklara rader.
Låt i stället namn och metodstruktur berätta vad som händer.

 */

public class PotionShop {

    public static void main(String[] args) {

        final int POTION_PRICE = 30;
        final int HEAL_AMOUNT = 25;

        Player hero = new Player("Venu", 60, 100);

        System.out.println("Before purchase: ");
        hero.printStatus();

        if (hero.canBuyPotion(POTION_PRICE)){
            hero.buyPotion(POTION_PRICE);
            hero.heal(HEAL_AMOUNT);
        }else {

            System.out.println("You cannot afford to buy the potion");
        }

        System.out.println("After purchase: ");
        hero.printStatus();

    }





}
