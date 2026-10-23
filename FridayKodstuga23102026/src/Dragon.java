import java.util.Random;

public class Dragon extends Monster implements SpecialAttack{

    private final Random random = new Random(); // To generate different values

    public Dragon(){
        super("Dragon");
    }

    @Override
    public int attack() {
        int damage = random.nextInt(11) + 10; //Range from 10 to 20
        System.out.println(name + " breathes fire! " +
                "\nDamage caused: "+ damage );
        return damage;
    }

    @Override
    public int useSpecialAttack() {
        int damage = random.nextInt(11) + 20; //Range from 20 to 30

        System.out.println(name + " uses FIRESTROM!!" +
                "\nDamage caused: " + damage);
        return damage;
    }
}
