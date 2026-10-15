/*Övning 1 - Djur
* Skapa en klass Djur med ett field som heter ljud.
* Skapa en konstruktor som tar emot ljudet.
* Skapa metoden gorljud() som skriver ut ljudet.
* Skapa en hund och katt i Main och låt dem göra olika ljud.
*/

public class Djur {
    String ljud;

    public Djur(String ljud){
        this.ljud = ljud;
    }
    public void gorLjud(){
        System.out.println(ljud);
    }
}
