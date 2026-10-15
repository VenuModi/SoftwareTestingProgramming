/*Övning 3 -  Superhjältekraft
* En superhjälte har olika egenskaper som tillsammans avgör hur stark hjälten är.
* - Skapa metoden powerLevel(int strength, int spped).
* - Metoden ska retunera strength + speed.
* - Anropea metoden från main() och skriv ut resultatet.
* - Bonus: Lägg till en tredje parameter, exemplivis intelligence, och låt den också påverka.
*/

public class Hero {
    private int monsterLives = 100;
    public static void showGameTitle(){
        System.out.println("Welcome to Boss fight!");
    }
    public void showAttack(){
        System.out.println("Hero is attacking the monster!");
    }
    public void attack(int damage){
        monsterLives = monsterLives - damage;
        if (monsterLives < 10){
            monsterLives = 0;
        }

    }
    public int getMonsterLives(){
        return monsterLives;
    }
}
