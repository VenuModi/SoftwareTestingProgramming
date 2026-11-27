import java.util.ArrayList;

public class Player {

    private final String playerName;
    private int score;
    private final ArrayList<Die> dice;
    //private Die die;//Single player single die


    public Player(String playerName) {
        this.playerName = playerName;
        this.score =0;
        this.dice = new ArrayList<>();//Initialize the ArrayList
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addDie(int numberOfSides)
    {
        die = new Die(numberOfSides);
        System.out.println("\nWelcome " + getPlayerName() + "!");
        System.out.println("\n" + getPlayerName() + " - You have chosen to play with " + die.getNumberOfSides() + " sided die.");
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
        setScore(this.score + 1);
        //score++;

    }
}
