/*4. Äventyrarens kompass
* Du skapar ett äventyrsspel där spelaren kan gå i olika värdestreck.
* - Skapa en enum som heter Direction
* - Lägg till NORTH, EAST, SOUTH och WEST.
* - Skapa en variabel som innehåller Direction.NORTH.
* - Använd switch-case för att skriva ur olika meddelanden beroende på riktning.
* - Använd Direction.values() tillsammans med en enhanced for-lop för att skriva ur alla riktningar
* Bonus: Ändra spelarens riktning oshc se hur utskriften föräåndras.*/

public class AdventureCompass {
    public static void main(String[] args) {

        //Direction direction = Direction.NORTH;
        Direction direction = Direction.EAST;

        switch (direction) {
            case NORTH -> {
                System.out.println("Your travel direction is North!");
                break;
            }
            case EAST -> {

                System.out.println("Your travel direction is East!");
                break;
            }
            case SOUTH -> {
                System.out.println("Your travel direction is South!");
                break;
            }
            case WEST -> {
                System.out.println("Your travel direction is West!");
                break;
            }
        }

            for (Direction d : Direction.values()){
                System.out.println(d);

        }
    }
}
