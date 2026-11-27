import java.util.Scanner;

public class GoblinChallenge implements Challenge{

    @Override
    public boolean play(Player player, Scanner scanner) {

        int goblinHealth = 60;

        System.out.println("A Goblin blocks your path!");

        while (player.isAlive() && goblinHealth > 0){

            System.out.println("Goblin HP: " + goblinHealth);

            System.out.println("Your HP: " + player.getHealth());

            System.out.println("1. Attack");
            System.out.println("0. Return to hall");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":

                    goblinHealth = Math.max(0, goblinHealth - 20);

                    System.out.println("You deal 20 damage!");

                    if (goblinHealth == 0) {

                        System.out.printf("You defeated the Goblin!!");

                        return true;
                    }

                    System.out.println("The Goblin deals 20 damage!");

                    player.takeDamage(20);

                    break;

                case "0":
                    return false;

                default:
                    System.out.println("Invalid choice. Try again!!");
            }
        }
        return false;
    }
}
