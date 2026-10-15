/*Övning 4 - Den hungriga hunden
* Skapa en klass Dog där hundens hunger kan förändras med hjälp av metoder.
* Skapa instansvariablen int hunger.
* Skapa metoden eat() som minskar hundens hunger.
* Skapa metoden showHunger() som skriver ut hur hungrig hunden är.
* Skapa ett Dog-objekt i main() och anropa metoderna med punktoperatorn.
* Tranär på: objekt, state, void-metoder och punktoperatorn. */

public class Dog {
    int hunger = 5;
    public void eat (){
        hunger = hunger - 1;
    }
    public  void showHunger(){
        System.out.println("Dog's hunger level: " + hunger);
    }

}
