import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        GameCafe gameCafe = new GameCafe();

        GameCafe emptyCafe = new GameCafe();

       gameCafe.registerPlayer("Venu");
       gameCafe.registerPlayer("Ramta");
       gameCafe.registerPlayer("Ouras");
       gameCafe.registerPlayer("Rekha");
       gameCafe.registerPlayer("venu");

        gameCafe.showPlayers();

        emptyCafe.showPlayers();

    }
}
