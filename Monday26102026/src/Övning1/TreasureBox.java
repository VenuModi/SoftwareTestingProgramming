package Övning1;
/*1. skattkistan som kraschar
*Skapa en array med tre skatter:
* int[] treasure ={100, 200, 300};
* - Försök skriva elementet på index 5 och kör programmet.
* - Läs felmeddelandet i terminalen. Vilken exception-typ får du?
* - Lägg den riskabla raden i ett try-block.
* - Fånga felet med catch(ArrayOutOfBoundException e).
* - Skriv ut ett eget meddelande och även e.getMessage().
* Fundera: Är detta ett kompileringsfel eller ett fel som upptår under körning?
*/

public class TreasureBox {

    public static void main(String[] args) {

        int[] treasure = {100, 200, 300};

        try{
            System.out.println(treasure[5]); //Causes an runtime error & not compilation error
        } catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Treasure not found");
            System.out.println(e.getMessage());
        }

        System.out.println("Game Continues....");
    }
}
