import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean running = true;//Control whether the program should continue

        GameCafe gameCafe = new GameCafe();

        while (running) {

            showMenu();

            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();


            switch (choice) {

                case "1":
                    System.out.print("You have selected to register a player" +
                            "\nEnter the name of the player: ");

                    String name = scanner.nextLine();

                    gameCafe.registerPlayer(name);

                    break;

                case "2":
                    System.out.println("You have selected option to show the list of players.");
                    gameCafe.showPlayers();
                    break;

                case "3":
                    System.out.print("You have selected to join the waiting queue" +
                            "\nEnter the name of the player: ");

                    String NameOfPlayersInQueue = scanner.nextLine();

                    gameCafe.addToQueue(NameOfPlayersInQueue);

                    break;

                case "4":
                    System.out.println("You have selected the option to see the waiting queue.");

                    gameCafe.showQueue();

                    break;

                case "5":
                    System.out.println("You have selected the option to see the next player.");

                    gameCafe.nextPlayer();

                    break;

                case "6":

                    System.out.print("You have selected the option to add points of a player." +
                            "\nEnter the name of the player whose points are to be added: ");

                    String nameOfScorer = scanner.nextLine();

                    try{
                        System.out.print("Enter points: ");

                        int points = Integer.parseInt(scanner.nextLine());//Convert the integer to String

                        if (points < 0){

                            System.out.println("Points cannot be negative!");

                            break;
                        }
                        gameCafe.addPoints(nameOfScorer, points);

                    }catch (NumberFormatException e){

                        System.out.println("!!PLEASE ENTER A WHOLE NUMBER!!");
                    }
                    break;

                case "7":
                    System.out.println("You have selected the option to show scores.");

                    gameCafe.showScores();

                    break;


                case "0":
                    System.out.println("Bye!! See you next time!!");

                    running = false;

                    break;

                default:
                    System.out.println("Invalid choice!!");
            }
        }
        scanner.close();
    }

    public  static  void showMenu(){

        System.out.println("======WELCOME TO THE GAME CAFE======");
        System.out.println("1. Register player");
        System.out.println("2. Show registered players");
        System.out.println("3. Join waiting queue");
        System.out.println("4. Show waiting queue");
        System.out.println("5. Next player");
        System.out.println("6. Add points");
        System.out.println("7. Show Scores");
        System.out.println("0. Exit");

    }
}
