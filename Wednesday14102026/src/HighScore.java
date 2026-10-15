/*Övning 2 - Highscore-listan
* Du utvecklar ett spel och vill hålla reda på spelarnas poäng.
* - Skapa en int[] som innehåller fem olika poäng.
* - Använd en valig for-loop för att skriva ur all poäng.
* - Skriv uir den totala suman av poängen.
* - Använd Arrays.sort() för att sortera poängen.
* - Skriv ur den sorterade arrayen med Arrays.toString().
* Bonus: Skriv ur den högsta poängen efter sorteringen.
*/

import java.util.Arrays;

public class HighScore {
    public static void main(String[] args) {

        int[] scores = {
                80, 99, 75, 69, 90
        };
        int total = 0;

        //Print scores and calculate total
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score: " + scores[i]);
            total =  total + scores[i];
        }
        System.out.println("Total scores: " + total);

        //Sort scores
        Arrays.sort(scores);

        //Print out sorted arrays
        System.out.println("Sorted score: " + Arrays.toString(scores));

        //Bonus: Print highest score
        System.out.println("Highest score: " + scores[scores.length-1]);
    }
}
