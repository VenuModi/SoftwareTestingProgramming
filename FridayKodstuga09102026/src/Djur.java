/*4. Bygg ett eget djur
* - Skapa klassen Djur med namn, ålder & ljud.
* - Skapa en konstruktor som sätter värden på variablerna.
* - Skapa metoden gorLjud() som skriver ur djurets ljud.
* - Skapa minst två olika Djur-objekt i main och låt dem göra sina ljud
*/

public class Djur {
    String name;
    int age;
    String sound;

    public Djur(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }
    public void gorLjud(){
        System.out.println(name + " says " + sound);
    }
}
