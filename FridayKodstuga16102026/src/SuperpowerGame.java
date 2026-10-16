/*Övning 5 - Välj din superkraft!
* Skapa en enum som heter Superkraft.
* - Lägg till ELD, IS, VIND och BLIXT.
* - Skapa en variabel som håller spelarens superkraft.
* - Använd switch för att skriva ur ett meddelande beroende på superkraft.
* Extra Utmaning: Använd values() och en enhanced for-loop för att skriva ur all tillgängliga superkrafter.*/

public class SuperpowerGame {

    public void showSuperpower(Superpower superpower){

        switch (superpower){
            case ELD:
                System.out.println("You have the superpower of controlling FIRE");
                break;
            case IS:
                System.out.println("You the superpower of controlling ICE");
                break;
            case VIND:
                System.out.println("You have the superpower of controlling WIND");
                break;
            case BLIXT:
                System.out.println("You have the superpower of controlling THUNDER");
                break;
        }
    }

    public void showAllSuperpowers(){

        for (Superpower power : Superpower.values()){
            System.out.println(power);
        }
    }


}
