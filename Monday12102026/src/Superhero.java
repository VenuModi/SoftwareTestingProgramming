/*Övning 3 - Superhjältekraft
* En superhjälte har olika egenskaper som tillsammans avgör hur stark hjälten är.
* Skapa metoden powerrLevel(int strength, int speed).
* Metoden ska retunera strength + speed.
* Anropa metoden från main() och skriv ut resultatet.
* Bonus: Lägg till en tredje parameter, exemplivis intelligence, och låt den också påverka resultatet.
* Träna på: flera parametrar och returvärden.
*/

public class Superhero {
    public int PowerLevel(int strength, int speed){
        int totalPower = strength + speed;
        return totalPower;
    }
    public void ShowPower(int power){
        System.out.println("Power Level: " + power);
    }
    public void showPower(String power){
        System.out.println("Power Level: " + power);
    }
}
