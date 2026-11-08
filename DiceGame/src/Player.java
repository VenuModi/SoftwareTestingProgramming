public class Player {

    private final String playerName;
    private int score;
    private Die die;


    public Player(String playerName)
    {
        this.playerName = playerName;
        this.score =0;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public String getPlayerName(){
        return playerName;
    }

    public void addDie(int numberOfSides)
    {
        die = new Die(numberOfSides);
    }

    public void rollDice(){
        die.roll();
    }

    public int getDieValue(){
        return die.getCurrentValue();
    }
    public void increaseScore(){
        score++;

    }
}
