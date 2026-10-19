package Övning4;
/* Övning 4 -  Djurens talangshow
Nu kombinerar du arv, interface och polymorfism
- Skapa en abstrakt klass Animal med en abstrakt metod makeSound().
- Skapa interfacet Playable med metoden Play().
- Skapa Dog och Cat som ärver från Animal. Låt minst Dog implementera Playable.
- Skapa objekten i main och spara dem i variabler av typen Animal. Anropa makeSound() på båda.
- Skapa en metod showTalent(Playable participant) som anropar play(). Skicka in din Dog till metoden.
Extra utmaning: Låt även Cat implementera Playable och testa samma metod med båda.
* */

public abstract class Animal {

    public abstract void makeSound();
}
