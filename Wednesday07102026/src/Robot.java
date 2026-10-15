/*Övning 3 - Robot
* Skapa en klass Robot med ett public field namn och ett private field batteri.
* Sätt värdena med en konstruktor och använd this.
* Skapa en metod visaStatus() som skriver ut namn och batteri.
* Skapa en robot i Main. Testa vad som händer om du försöker ändra batteri direkt från Main.
*/

public class Robot {
    String namn;
    int batteri;

    public Robot (String namn, int batteri){
        this.namn = namn;
        this.batteri = batteri;
    }
    public void visaStatus(){
        System.out.println("Robot: " + namn);
        System.out.println("Battery: " + batteri);
    }
}
