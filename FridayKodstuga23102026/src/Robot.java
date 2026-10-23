import java.util.Random;

public class Robot extends Monster implements SpecialAttack{

    private final Random random = new Random(); // To generate random values

    public Robot(){
        super("Robot");
    }

    @Override
    public int attack() {

        int damage = random.nextInt(11) + 8; //Range from 8 to 18
        System.out.println(name + " shoots a laser!!" +
                "\nDamage caused: " + damage);
        return damage;
    }

    @Override
    public int useSpecialAttack() {

        int damange = random.nextInt(11) + 18; //Range from 18 to 28
        System.out.println(name + " uses POWER BLAST!" +
                "\nDamage caused: " + damange);
        return damange;
    }
}
