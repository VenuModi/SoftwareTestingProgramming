/*Övning 4 - Hitta den hemliga skatten!
* Skapa en it-array med fem olika mängder guld.
* - Skapa en metod som heter raknaGuld.
* - Metoden ska ta emot en array som parameter.
* - Använd en loopå för att räkna ihop allt guld.
* - Returnera totalsumman och skriv ut resultatet.
* Extra Utmaning: Skapa en metod som hittar den största guldmängden i en kista.*/

public class Treasure {

    public int raknaGuld(int[]gold){
        int total = 0;

        for (int i = 0; i < gold.length; i++) {

            total = total + gold[i];

        }
        return total;
    }

    //Find the largest gold 
    public int storstaGuld (int[] gold){
        int largest = gold[0];

        for (int i = 0; i < gold.length; i++) {
            if (gold[i] > largest){
                largest = gold[i];
            }

        }
        return largest;
    }
    
    // Print the largest gold
    public void visaGuld(int[] gold){

        int total = raknaGuld(gold);

        int largest = storstaGuld(gold);

        System.out.println("Total gold:" + total);
        System.out.println("Largest gold: " + largest);
        
        
    }
}
