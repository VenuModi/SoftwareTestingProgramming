import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiPlayerGame {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("===== MULTIPLAYER DICE GAME! =====");

        //Create players and give them dice
        ArrayList<Player> players = initialize();

        //Ask for number of rounds
        int numberOfRounds = 0;

        while (numberOfRounds <= 0){

            try {
                System.out.println("How many rounds? ");
                numberOfRounds = scanner.nextInt();

                if (numberOfRounds <= 0){
                    System.out.println("Rounds must be greater than 0.");
                }
            }catch (InputMismatchException e){
                System.out.println("Please enter a whole number.");
                scanner.nextLine();
            }
        }

        //Play rounds
        for (int round = 1; round <= numberOfRounds; round++) {

            System.out.println("\n----- Round - " + round + " -----");

            takeTurn(players);
        }

        //Find the winner or winners
        ArrayList<Player> winners = getWinners(players);

        System.out.println("\n====== GAME OVER ======");

        //Show final scores
        for (Player player : players){
            System.out.println(player.getPlayerName() + " " + player.getScore() + " points");
        }
        System.out.println("\nWinner(s): ");

        for (Player winner : winners){
            System.out.println(winner.getPlayerName() +
                    " with " + winner.getScore() + " points!");
        }
        scanner.close();
    }

    //Create players and dice
    private static ArrayList<Player> initialize(){

        ArrayList<Player> players = new ArrayList<>();

        int numberOfPlayers = 0;
        int numberOfDice = 0;

        //Ask for number of players
        while (numberOfPlayers < 2){

            try {
                System.out.println("How many players? ");
                numberOfPlayers = scanner.nextInt();

                if (numberOfPlayers < 2){
                    System.out.println("You need atleast 2 players.");
                }
            }catch (InputMismatchException e){
                System.out.println("Please enter a whole number.");
                scanner.nextLine();
            }
        }

        //Ask for number of dice per player
        while (numberOfDice <= 0){

            try{
                System.out.println("How many dice per player? ");
                numberOfDice = scanner.nextInt();

                if (numberOfDice <= 0){
                    System.out.println("Each player needs atleast 1 die.");
                }
            }catch (InputMismatchException e){
                System.out.println("Please enter a whole number.");
                scanner.nextLine();
            }
        }

        //Clear the leftover Enter
        scanner.nextLine();

        //Create each player
        for (int i = 1; i <= numberOfPlayers; i++) {

            String name = "";

            while (name.isBlank()){

                System.out.println("Enter player " + i + " name");
                name = scanner.nextLine();

                if (name.isBlank()){
                    System.out.println("Name cannot be empty!!");
                }
            }
            Player player = new Player(name);

            //Give dice to each player
            for (int j = 0; j <= numberOfDice ; j++) {
                player.addDie(6);

            }

            players.add(player);
        }
        return players;
    }

    //Every player rolls their dice
    private static void takeTurn(ArrayList<Player> players){

        for (Player player : players){

            System.out.println("\n" + player.getPlayerName() + "'s turn!");

            player.rollDice();

            int roundTotal = 0;

            for (Die die : player.getDice()){

                int value = die.getCurrentValue();

                System.out.println("Die rolled: " + value);

                roundTotal += value;
            }

            player.setScore(player.getScore() + roundTotal);

            System.out.println("Round points: " + roundTotal);
            System.out.println("Total socre: " + player.getScore());
        }
    }

    //Find the winner/winners
    private  static ArrayList<Player> getWinners(ArrayList<Player> players){

        ArrayList<Player> winners = new ArrayList<>();

        int highScore = -1;

        for (Player player : players){

            if (player.getScore() > highScore){

                highScore = player.getScore();

                winners.clear();
                winners.add(player);
            }
        }
        return winners;
    }
}
