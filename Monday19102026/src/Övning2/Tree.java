package Övning2;
/*Övning 2 - Mystiska trädet
Alla träd är träd, men olika träd kan beskrivas på olika sätt.
- Skapa en abstrakt kalss Tree med en instansvariabel height.
- Lägg till en abstrakt metod describe().
- Skapa klasserna Oak och Pine som ärver från Tree och implementerar describe() på olika sätt.
- Skapa objekt av Oak och Pine i main och skriv ur deras beskrivningar.
Extra utmaning: Prova att skriva new Tree() - varför får du ett kompileringsfel?
* */
public  abstract class Tree {

    double height;

    public Tree(double height){
        this.height = height;
    }

    public abstract void describe();
}
