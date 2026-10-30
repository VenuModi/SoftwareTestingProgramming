package Övning5;

/*5. Liten förändring, stor skillnad
* Skapa en List<Integer> med minst fyra poäng från cefeets spel. Skriv ur poängen, sortera dem med Collections.sort()
* och skriv ut dem igen. Varför används Integer och inte int mellan <>?*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CafeGameScores {

    public static void main(String[] args) {

        List<Integer> gameScores = new ArrayList<>();

        gameScores.add(100);
        gameScores.add(87);
        gameScores.add(32);
        gameScores.add(95);

        System.out.println("Before sorting: " + gameScores);

        Collections.sort(gameScores);

        System.out.println("Scores after sorting: " + gameScores);
    }

}
