package Övning1;
/*Övning 1-  Djurparken
 * I djurparken finns flera sorters djur.
 * - Skapa en klass Animal med en instansvariabel name och en konstruktor som tar emot ett namn.
 * - Skala klasserna Dog och Cat som ärver från Animal med extends.
 * - Ge båda klasserna en konstruktor som använder super(name).
 * - Skapa en metod makeSound() i Animal. Låt Dog och Cat skriva över den så att de låter olika.
 * - Skapa ett Dog-objekt och ett cat-objekt i main och anropa makeSound() på båda.
 * - Extra utmaning: Skapa ytterligare en djurklass som ärver från Animal.
 */

public class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void makeSound(){
    }
}
