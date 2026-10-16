/*Övning 1 - Hälsa på din robot!
* Skapa en metod som heter halsa.
* - Metoden ska ta emot ett namn som parameter.
* - Metoden ska skriva ut till exempel: "Hej Alex! Jag är din robot!"
* - Anropa metoden flera gånger med olika namn.
* Extra Utmaning: Skapa ytterligare en metod som returnerar robotens favouritnummer.*/

import java.util.Random;

public class Robot {
    public void halsa(String name){
        System.out.println("Hej " + name + "! Jag är din robot!");
    }
    public int favoritNummer(){
//        Random random = new Random();
//
//        int number = random.nextInt(10) + 1;
//        return nummer;
        return (int) (Math.random() * 10) + 1;
    }
}
