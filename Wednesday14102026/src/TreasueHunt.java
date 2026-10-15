/*Övning 3 - Skattjakten
* Su ska skapa en liten skattkarta med hjälp av en tvådimensionell array.
* - Skapa en int[][] med 3 rader och 3 kolumner.
* - Placera ur en skatt genom att sätta värdet 1 på valfri position.
* - Låt alla andra positioner ha värdet 0.
* - Använd två for-loopar för att skriva ur hela kartan som ett rutnät.
* Bonus: Flytta skatten genom att ändra två värden i arrayen.
*/

public class TreasueHunt {
    public static void main(String[] args) {

        //Create a 3x3 treasue map

        int[][] map = new int[3][3];

        //Place treasure in the middle

        map[1][1] = 1;

        //Print map
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.println(map[row][column] + "");
            }
            System.out.println();

        }

        //Bonus: Move the treasue
        map[1][1] = 0;
        map[0][2] = 1;

        System.out.println("After moving the treasure: ");

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.println(map[row][column] + "");

            }
            System.out.println();

        }

    }
}
