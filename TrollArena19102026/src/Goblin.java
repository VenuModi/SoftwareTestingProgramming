
import java.util.Random;

public class Goblin extends Character implements Healable{

    Random random = new Random();

    public Goblin(){
        super("Goblin", 50);
    }

    @Override
    public void attack(Character target) {
        //System.out.println(name + " attacks for 10 damages");

        int damage = random.nextInt(11) + 5; // 11 prodcues 0 to 10 and + 5 produces integers from 1 to 15.

        System.out.println(name + " attacks " + target.getName() + " for " + damage + " damage!");

        target.takeDamage(damage);

        //target.takeDamage(10);
    }

    @Override
    public void heal() {
        health += 10;
        if (health > 50){
            health = 50;
        }
        System.out.println(name + " heals!");
    }

    @Override
    public void showPicture() {
        System.out.println("   /\\_/\\   ");
        System.out.println("  ( o o )  ");
        System.out.println("  /  ^  \\  ");
        System.out.println(" (_______) ");
        System.out.println("   GOBLIN  ");
    }
}
