import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;

public class GameCafe {

    private HashSet<String> players; //Register & store players

    private ArrayDeque<String> playersWaitingOrder; //Order in which players waiting to play

    private HashMap<String, Integer> playerScores; //Keep track of the scores

    public GameCafe(){
        players = new HashSet<>();
        playersWaitingOrder = new ArrayDeque<>();
        playerScores = new HashMap<>();
    }

    public void registerPlayer(String name){

        if (players.add(name)){
            System.out.println(name + " has been registered.");

        }else {
            System.out.println(name + " already exists in the system!!");
        }
    }

    public void showPlayers(){

        System.out.println("Registered players: " + players);
    }

    public void addToQueue(String name){

        //Check if the player is registered.
        if (!players.contains(name)){
            System.out.println(name + " is not registered to play.");
            return;
        }
        //Check if the player is already in the queue.
        if (playersWaitingOrder.contains(name)){
            System.out.println(name + " is already waiting in the queue.");
            return;
        }

        playersWaitingOrder.offer(name);
        System.out.println(name + " joined the queue.");

    }

    public void showQueue(){

        System.out.println("Waiting queue: " + playersWaitingOrder);
    }

    //Players take turns
    public void nextPlayer(){

        String name = playersWaitingOrder.poll();//Removes & returns the first player in queue

        if (name == null){
            System.out.println("No players are waiting.");
            return;
        }
        System.out.println(name + " is now playing");

    }

    //Store points of players
    public void updateScore(String name, int points){

        //No unregistered player points are allowed to be displayed
        if (!players.contains(name)){
            System.out.println(name + "is not registered");
            return;
        }

        playerScores.put(name, points); //Add a key value pair

        System.out.println(name + " has " + points + " points.");
    }

    public void showScores(){

        System.out.println("Player scores: " + playerScores);
    }

    //Add points to existing score
    public void addPoints(String name, int points){

        if (!players.contains(name)){
            System.out.println(name + " is not registered.");
            return;
        }

        int currentScore = playerScores.getOrDefault(name, 0);//If the player has not scored yet, then default point at 0

        int newScore = currentScore + points;//updated points

        playerScores.put(name, newScore);

        System.out.println(name + " now has " + newScore + " points.");
    }

}
