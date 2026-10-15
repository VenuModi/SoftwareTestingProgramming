/*Övning 2 - Spelkaraktär
* Skapa en klass Spelkaraktar med fields för namn och liv.
* Skapa en konstruktor som sätter namn och liv.
* Skapa en metod presentera() som skriver ut karaktärens namn och liv.
* Skapa två olika karaktärer i Main.
*/

public class Spelkaraktar {
    String namn;
    int liv;

    public Spelkaraktar(String namn, int liv){
        this.namn = namn;
        this.liv = liv;
    }
    public void presentera(){
        System.out.println("Name: " + namn);
        System.out.println("Life: " + liv);
    }

}
