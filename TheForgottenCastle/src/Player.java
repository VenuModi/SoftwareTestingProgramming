import java.util.HashSet;
import java.util.Set;

public class Player {

    private static final int XP_PER_LEVEL = 100;

    private final String name;
    private int health = 100;
    private int maxHealth = 100;
    private int level = 1;
    private int experience = 0;

    private final Set<KeyType> keys = new HashSet<>();

    public Player (String name) {
        this.name = name;
    }

    public void takeDamage(int amount){

        if (amount < 0){
            throw new IllegalArgumentException("Damage must not be negative.");
        }

        health = Math.max(0, health - amount);

        System.out.println("Health:" + health + "/" + maxHealth);
    }

    public void heal(int amount){

        if (amount < 0) {
            throw new IllegalArgumentException("Healing must not be negative!!");
        }
        if (isAlive()) {
            health = Math.min(maxHealth, health + amount);
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void gainExperience (int amount) {

        if (amount < 0) {
            throw new IllegalArgumentException("XP must not be negative");
        }
        experience += amount;

        while (experience >= level * XP_PER_LEVEL) {
            levelUp();
        }
    }

    public void levelUp() {
        level ++;

        maxHealth += 20;

        heal(10);

        System.out.println("LEVEL UP!! You reached Level " + level);
    }

    public boolean collectKey (KeyType key) {
        return keys.add(key);
    }

    public boolean hasKey (KeyType key) {
        return keys.contains(key);
    }

    public int getKeyCount () {
        return keys.size();
    }

    public int getHealth (){
        return health;
    }

    public int getMaxHealth () {
        return maxHealth;
    }

    public int getLevel () {
        return level;
    }

    public int getExperience () {
        return experience;
    }

    public void showStatistics () {

        System.out.println(name + " | Level " + level
        + " | " + experience + " XP"
        + " | Health: " + health + "/" + maxHealth
        + " | Keys: " + keys.size() + "/4");
    }

}
