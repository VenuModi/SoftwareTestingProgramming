public class Main {
    public static void main(String[] args) {

        //Övning 1 - Hälsningsroboten
        Robot robot = new Robot();
        robot.halsa();

        //Övning 2 - Pizzakalkylatorn
        PizzaClaculator pizza = new PizzaClaculator();
        double total = pizza.beraknaPris(3, 150);
        System.out.println("Total Price = " + total + "Kr");


        //Övning 3 - Superhjältekraft
        Superhero superhero = new Superhero();
        int power = superhero.PowerLevel(30, 15);
        System.out.println("Superhero Power: " + power);

        //Övning 6 - Samma metod, olika magi
        superhero.ShowPower(100);
        superhero.showPower("Fire");

        //Övning 4 - Den hungriga hunden
        Dog dog = new Dog();
        dog.showHunger();
        dog.eat();
        dog.showHunger();

        //Övning 5 - Hemlig hi8ghscore
        Player player = new Player();
        player.setScore(300);
        System.out.println(player.getScore());

        //Övning 7 - Boss flight - Metodprogrammet
        Hero hero = new Hero();
        Hero.showGameTitle();
        hero.showAttack();
        hero.attack(20);
       int lives = hero.getMonsterLives();
        System.out.println("Monster lives: " + lives);
    }
}
