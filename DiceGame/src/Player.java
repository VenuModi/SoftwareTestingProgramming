import java.util.ArrayList;

public class Player {

    private final String playerName;
    private int score;
    private final ArrayList<Die> dice;
    //private Die die;//Single player single die


    //Constructor
    public Player(String playerName) {
        this.playerName = playerName;
        this.score =0;
        this.dice = new ArrayList<>();//Initialize the ArrayList
    }

    public String getPlayerName(){
        return playerName;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //Add a new die to the player
    public void addDie(int numberOfSides){
        dice.add(new Die(numberOfSides));//Add dice to the list
    }

    //Roll all the dice belonging to the player
    public void rollDice(){

        for (Die die : dice){
            die.roll();
        }
    }

    //Return the value of the first die
    public int getDieValue(){
        return dice.get(0).getCurrentValue();//Keep original getDieValue(). .get(0) is to get the first die in the ArrayList.
    }

    //Return the list of dice
    public ArrayList<Die> getDice(){
        return dice;
    }

    //Increase the score by one
    public void increaseScore(){
        score++;

    }
}
