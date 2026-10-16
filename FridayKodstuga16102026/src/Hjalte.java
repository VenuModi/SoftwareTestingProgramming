/*Övning 6 - Bygg ett litet spel!
* Skapa en klass som heter Hjalte
* - Ge hjälten en privat instansvariabel poang.
* - Skapa en getter som returnerar poängen.
* - Skapa en setter som kan ändra poängen.
* - Skapa en int-array med fem pöangvärden, till exempel {10,20,5,50,15}
* - Använd en loop för att räkna ihop poängen och ge dem till hjälten.
* - Skriv ur hjältens totala poäng.
* Extra utmaning: Skapa en metod som tar emot en array och retunerrar den högsta poängen.
*/

public class Hjalte {

    private int poang;

    public int getPoang(){
        return poang;
    }
    public void setPoang(int poang){
        this.poang = poang;

    }

    public int hogstaPoang(int[] poang){
        int highest = poang[0];

        for (int i = 1; i < poang.length; i++) {
            if (poang[i] > highest){
                highest = poang[i];
            }

        }
        return highest;
    }

}
