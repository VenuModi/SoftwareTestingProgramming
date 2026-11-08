import java.util.Random;

public class Die {

    private final int numberOfSides;
    private int currentValue;
    private final Random random;

    //Constructor
    public Die(int numberOfSides){

        if (numberOfSides < 2){
            throw new IllegalArgumentException("A die must have at least 2 sides.");//Defensive programming just in case if someone writes Die die = new Die(0);
        }

        this.numberOfSides = numberOfSides;
        this.currentValue = 0;
        this.random = new Random();
    }

    public int getNumberOfSides(){
        return numberOfSides;
    }

    public int getCurrentValue(){
        return currentValue;
    }

    public void roll(){
        currentValue = random.nextInt(numberOfSides) + 1;
    }
}
