/*Övning 1 - Dit eget spellager
* Du har samlat fem föremål i ett datorspel och vill spara dem i en array.
* Skapa en String[] med fem valfria föremål, exemplvis svärd, sköld och potion.
* Skriv ut det dörsta och sista föremålet med hjälp av index
* Byt ut det tredje föremål mot något bättre.
* Skriv ut hur många föremål du har med .length
* Bonus: Använd en enhanced for-loop för att skriva ut hela ditt spellager.
*/
public class GameInventory {
    public static void main(String[] args) {

        //Create an array with 5 wepons
        String [] wepons = {
             "Sword", "Sheild", "Potion", "Bow", "Helmet"
        };

        //Print the first & last wepon
        System.out.println("First wepon: " + wepons[0]
                             +"\nLast Wepon: " + wepons[4]);

        //Replace the third wepon
        wepons[2] = "Arrow";

        // Print the number of items.
        System.out.println("Number of wepons: " + wepons.length);

        //Bonus: print all wepons
        for (String wepon : wepons){
            System.out.println(wepon);
        }
    }
}
