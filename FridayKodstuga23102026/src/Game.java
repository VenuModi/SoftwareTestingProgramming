import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*Outside while loop for keeping track of points throughout the game*/
        Arena arena = new Arena();


        boolean running = true;

        while (running){
            System.out.println("\n=== MONSTER ARENA ===");
            System.out.println("1. Show all monsters");
            System.out.println("2. Start a match");
            System.out.println("3. Show Leaderboard");
            System.out.println("4. Show monster types");
            System.out.println("5. Exit");

            System.out.println("Choose an option: ");

            if (!scanner.hasNextInt()){//To check if input is a valid integer.
                System.out.println("Please enter a number!");
                scanner.nextLine();
                continue;
            }
            int choice = scanner.nextInt();

            switch (choice){

                case 1: arena.showMonsters();
                break;

                case 2: arena.showMonsters();
                    System.out.println("Choose your monster (1-4): ");

                    if (scanner.hasNextInt()){
                        int monsterChoice = scanner.nextInt();
                        arena.startMatch(monsterChoice);
                    }else {
                        System.out.println("Please enter a valid number!");
                        scanner.nextLine();
                    }
                    break;

                case 3: arena.showLeaderBoard();
                break;

                case 4: arena.showMonsterTypes();
                break;

                case 5:
                    System.out.println("Thanks for playing!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        scanner.close();
    }
}
