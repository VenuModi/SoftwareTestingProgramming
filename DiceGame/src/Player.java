public class Player {

    private final String playerName;
    private int score;
    private Die die;


    public Player(String playerName) {
        this.playerName = playerName;
        this.score =0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getPlayerName(){
        return playerName;
    }

    public void addDie(int numberOfSides)
    {
        die = new Die(numberOfSides);
        System.out.println("\nWelcome " + getPlayerName() + "!");
        System.out.println("\n" + getPlayerName() + " - You have chosen to play with " + die.getNumberOfSides() + " sided die.");
    }

    public void rollDice(){
        die.roll();
    }

    public int getDieValue(){
        return die.getCurrentValue();
    }
    public void increaseScore(){
        setScore(this.score + 1);
        //score++;

    }
}
