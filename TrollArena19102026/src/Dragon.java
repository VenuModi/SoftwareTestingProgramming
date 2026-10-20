
import java.util.Random;

public class Dragon extends Character {

    Random random = new Random();

    public Dragon(){
        super("Dragon", 80);
    }

    @Override
    public void attack(Character target) {

        //System.out.println(name + " breathes fire for 15 damages!");

        int damage = random.nextInt(21) + 10; //Dragaon breathes fire for upto 30damages.
        // Range from 20 to 31 contains 21 possible integers.

        System.out.println(name + " breathes out fire for " + damage + " damage!");

        target.takeDamage(damage);

        //target.takeDamage(15);
    }

    @Override
    public void showPicture() {
        System.out.println("                          __        _");
        System.out.println("              _/  \\    _(\\(o");
        System.out.println("             /     \\  /  _  ^^^o");
        System.out.println("            /   !   \\/  ! '!!!v'");
        System.out.println("           !  !  \\ _' ( \\____");
        System.out.println("           ! . \\ _!\\   \\===^\\)");
        System.out.println("            \\ \\_!  / __!");
        System.out.println("             \\!   /    \\");
        System.out.println("       (\\_      _/   _\\ )");
        System.out.println("        \\ ^^--^^ __-^ /(__");
        System.out.println("         ^^----^^    \"^--v'");
        System.out.println("                 DRAGON ");
    }
}
