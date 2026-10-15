/*3. Raketuppskjutning
* - Gör en for-loop som räknar ner från 10 till 1.
* - Efter nedräkningen ska programmet skriva ut "LIFTOFF!"
* - Utöka programmet så att talet 5 hoppas över med continue.
*/

public class RocketLaunch {
    public static void main(String[] args) {
        for (int i = 10; i >=1 ; i--) {
            if (i==5){
                continue;
            }
            System.out.println(i);

        }
        System.out.println("LIFTOFF!");
    }
}
