
import java.util.Random;

public class Hero extends Character implements Healable {

    Random random = new Random();

    public Hero(String name){
        super(name, 100);
    }

    @Override
    public void attack(Character target) {
        //System.out.println(name + " attacks " + target.getName() + " for 220 damage!");

        int damage = random.nextInt(16) + 10; //16 generates 0 to 15 and adding +10 produces 1 to 25.

        System.out.println(name + " attacks " + target.getName() + " for " + damage + " damage!");

        target.takeDamage(damage);

        //target.takeDamage(20);
    }

    @Override
    public void heal() {
        health += 20;

        if (health > 100){
            health = 100;
        }

        System.out.println(name + " heals!");
    }

    @Override
    public void showPicture() {
        System.out.println("                                               :");
        System.out.println("                                              ::");
        System.out.println("                                             ::");
        System.out.println("                                             ::");
        System.out.println("                                            ::");
        System.out.println("                                            ::");
        System.out.println("                              __           ::");
        System.out.println("   _..-'/-¯¯--/_          ,.--. ''.     |`\\=,..");
        System.out.println("-:--.---''-..  /_         |\\\\_\\..  \\    `-.=._/");
        System.out.println(".-|¯         '.  \\         \\_ \\-`/\\ |    ::`");
        System.out.println("  /  @  \\      \\  -_   _..--|-\\¯¯``'--.-/_\\");
        System.out.println("  |   .-'|      \\  \\\\-\'\\_/     ¯/-.|-.\\_\\_/");
        System.out.println("  \\_./` /        \\_//-''/    .-'");
        System.out.println("       |           '-/'@====/              _.--.");
        System.out.println("   __.'             /¯¯'-. \\-'.          _/   /¯'");
        System.out.println(".''____|   /       |'--\\__\\/-._        .'    |");
        System.out.println(" \\ \\_. \\  |       _| -/        \\-.__  /     /");
        System.out.println("  \\___\\ '/   _.  ('-..| /       '_  ''   _.'");
        System.out.println("        /  .'     ¯¯¯¯ /        | ``'--''");
        System.out.println("       (  / ¯```¯¯¯¯¯|-|        |");
        System.out.println("        \\ \\_.         \\ \\      /");
        System.out.println("         \\___\\         '.'.   /");
        System.out.println("                         /    |");
        System.out.println("                        /   .'");
        System.out.println("                       /  .' |");
        System.out.println("                     .'  / \\  \\");
        System.out.println("                    /___| /___'");
        System.out.println("                         HERO  ");
    }
}
