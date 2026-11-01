import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        GameCafe gameCafe = new GameCafe();

//        GameCafe emptyCafe = new GameCafe();

       gameCafe.registerPlayer("Venu");
       gameCafe.registerPlayer("Ramta");
       gameCafe.registerPlayer("Ouras");

       gameCafe.addToQueue("Venu");
       gameCafe.addToQueue("Ramta");
       gameCafe.addToQueue("Ouras");

       gameCafe.updateScore("Venu", 100);
       gameCafe.updateScore("Ramta", 85);
       gameCafe.updateScore("Ouras", 100);
       gameCafe.addPoints("Venu", 100);
       gameCafe.addPoints("Venu", 150);


        gameCafe.showPlayers();
        //emptyCafe.showPlayers();
        gameCafe.nextPlayer();
        gameCafe.showQueue();
        gameCafe.showScores();

    }
}
