import java.util.Random;

public class Slime extends Monster{

    private final Random random = new Random();

    public Slime(){
        super("Slime");
    }

    @Override
    public int attack() {
        int damage = random.nextInt(11) + 5;//Range from 5 to 15
        System.out.println(name + "throws slime bombs!!" +
                "\nDamage caused: " + damage);
        return damage;
    }
}
