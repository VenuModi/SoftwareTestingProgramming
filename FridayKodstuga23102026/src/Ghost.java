import java.util.Random;

public class Ghost extends Monster implements SpecialAttack{

    private final Random random = new Random();

    public Ghost(){
        super("Ghost");
    }

    @Override
    public int attack() {
        int damage = random.nextInt(11) + 7;//Range from 7 to 17
        System.out.println(name + " uses Shadow attack!!" +
                "\nDamage caused: " + damage);
        return damage;
    }

    @Override
    public int useSpecialAttack() {
        int damage = random.nextInt(11) + 22; //Range from 22 to 32
        System.out.println(name + " uses GHOST JAB!!" +
                "\nDamage caused: " + damage);
        return damage;
    }
}
