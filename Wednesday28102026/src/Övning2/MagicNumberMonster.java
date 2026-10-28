package Övning2;
/*2. Magic Number Monster
* Talet 100 har en betydelse, men det syns inte i koden. Gör betydelsen tydlig med en namngiven konstant.

int playerScore = 120;

if (playerScore >= 100) {
    System.out.println("Level up!");
}

Skapa en konstant som beskriver vad 100 betyder.
Använd konstanten i if-satsen.
Fundera: blir koden lättare att söka efter och ändra senare?
*/

public class MagicNumberMonster {

    public static void main(String[] args) {

        final int LEVEL_UP_SCORE = 100;

        int playerScore = 120;

        if (playerScore >= LEVEL_UP_SCORE){
            System.out.println("Level up!");
        }

    }
}
