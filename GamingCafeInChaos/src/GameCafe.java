import java.util.HashSet;

public class GameCafe {

    private HashSet<String> players;

    public GameCafe(){
        players = new HashSet<>();
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
}
