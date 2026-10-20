
import java.util.Scanner;

public class TrollArena {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Troll Arena!");
        System.out.println("Enter the name of your Hero: ");

        String name = scanner.nextLine();

        Hero hero = new Hero(name);

        System.out.println("\nYour Hero: ");
        hero.showPicture();

        Character[] enemies = {
                new Goblin(),
                new Dragon()
        };

        for (Character enemy : enemies){

            System.out.println("\nA wild " + enemy.getName() + " is attacking!");

            enemy.showPicture();

            while (hero.isAlive() && enemy.isAlive()){

                System.out.println("\nYour health: " + hero.getHealth());

                System.out.println("\nChoose your action: ");
                System.out.println("1. Attack");
                System.out.println("2. Heal");
                System.out.println("Enter your choice: ");

                String choice = scanner.nextLine();

                if (choice.equals("1")){

                    hero.attack(enemy);
                } else if (choice.equals("2")) {

                    hero.heal();

                }else {

                    System.out.println("Invalid choice!");
                    continue;
                }
                if (enemy.isAlive()){
                    enemy.attack(hero);
                }
            }
            if (!hero.isAlive()){
                System.out.println(hero.getName() + "\nYOU LOST!");
                System.out.println("\nGAME OVER!");
                System.out.println(enemy.getName() + " WINS!");
                break;
            }

            System.out.println("\nYou defeated " + enemy.getName() + "!");
        }

        if (hero.isAlive()){
            System.out.println("\nCONGRATULATIONS!");
            System.out.println(hero.getName() + " WINS!");
            System.out.println("All enemies have been defeated!");
            System.out.println("GAME OVER!");
        }

        scanner.close();

//        Hero hero = new Hero("Troll Warlord");
//        Dragon dragon = new Dragon();
//        Goblin goblin = new Goblin();
//
//        hero.showPicture();
//        dragon.showPicture();
//        goblin.showPicture();
    }
}
