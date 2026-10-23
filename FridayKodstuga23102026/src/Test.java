public class Test {

    public static void main(String[] args) {

        Monster dragon = new Dragon();

        System.out.println(dragon.getHp()); //100HP

        dragon.takeDamage(20);

        System.out.println(dragon.getHp()); //80HP

        dragon.takeDamage(200);

        System.out.println(dragon.getHp()); //0

        dragon.resetHp();

        System.out.println(dragon.getHp());
    }
}
