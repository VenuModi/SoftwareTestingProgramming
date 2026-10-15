/*Övning 5 - Tärningsspelet
* Su ska skapa ett enkelt tärningsspel där resultaten från fem kast redan är bestämda.
* - Skapa en int[] med fem tärningskast, värden mellan 1 och 6.
* - Använd en loop för at skriva ur alla kast.
* - Räkna ur den sammanlagda poängen.
* - Använd Arrays.sort() för att sortera kasten.
* - Använd Arrays.binarySearch() föra att söka efter värdet 6 i den sorterade arrayen.
* Bonus: Använd Arrays.copyOf() för att skapa en ny array som har plats för ytterligare två kast.
*/

import java.util.Arrays;

public class DiceGame {
    public static void main(String[] args) {

        //Five predefined dice rolls
        int[] rolls = {
                2, 4, 1, 6, 5
        };

        int total = 0;

        //Print each roll and calculate the points
        for (int roll: rolls){
            System.out.println("Roll: " + roll);
            total = total + roll;
        }
        System.out.println("Total score: " + total);

        //Sort dice rolls
        Arrays.sort(rolls);
        System.out.println("Sorted rolls: " + Arrays.toString(rolls));

        //Lowest & Highest rolls
        System.out.println("Lowest roll: " + rolls[0]
                          +"\nHighest roll: " + rolls[rolls.length - 1]);

        //Search for the value 6
        int position = Arrays.binarySearch(rolls, 6);
        if (position >= 0){
            System.out.println("Found 6 at the index: " + position);
        } else {
            System.out.println("6 was not found.");
        }

        //Bonus: Create room for two more rolls
        int[] newRolls = Arrays.copyOf(rolls, 7);
        newRolls[5] = 5;
        newRolls[6] = 3;

        System.out.println("New rolls: " + Arrays.toString(newRolls));



    }
}
