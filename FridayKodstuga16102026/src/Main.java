import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        //Övning - 1 Hälsa på din robot!
//        Robot robot = new Robot();
//
//        robot.halsa("Alex");
//        int number = robot.favoritNummer();
//        System.out.println("Robotens favouritnummer är: " + number);
//
//        robot.halsa("Ramta");
//        int number1 = robot.favoritNummer();
//        System.out.println("Robotens favouritnummer är: " + number1);
//
//        robot.halsa("Rekha");
//        int nummer2 = robot.favoritNummer();
//        System.out.println("Robotens favouritnummer är: " + nummer2);
//
//        robot.halsa("Ouras");
//        int nummer3 = robot.favoritNummer();
//        System.out.println("Robotens favouritnummer är: " + nummer3);
//

//        //Övning - 2 Godisräknaren
//
//        Godies godies = new Godies();
//        double totalPrice = godies.raknaPris(3, 2.5);
//        System.out.println("Total price: " + totalPrice + "Kr");
//
//        System.out.println(godies.raknaPris(3, 2.5));
////        System.out.println(godies.raknaPris(3));
//
//
//        //Övning - 3 Ditt drömlag
//
//        DreamTeam team = new DreamTeam();
//        team.showTeam();

//
//        //Övning - 4 Hitta den hemliga skatten!
//
//        int[] gold = {
//                10, 50, 60, 100, 165
//        };
//
//        Treasure treasure = new Treasure();
//        int totalGold = treasure.raknaGuld(gold);
//
//        //System.out.println("Total gold = " + totalGold);
//
//        treasure.visaGuld(gold);

//
//        //Övning - 5 Välj din superkraft!
//
//        Scanner scanner = new Scanner(System.in);
//
//        SuperpowerGame game = new SuperpowerGame();
//
//        System.out.println("Availabe superpowers:");
//        game.showAllSuperpowers();
//
//        System.out.println("Choose your superpower: ");
//        String choice = scanner.nextLine().toUpperCase();
//
//        try{
//            Superpower playerPower = Superpower.valueOf(choice);
//            game.showSuperpower(playerPower);
//        } catch (IllegalArgumentException e){
//            System.out.println("Ivalid superpower. Please choose from the following ELD, IS, VIND or BLIXT.");
//        }
//        scanner.close();
//
//
        //Övning - 6 Bygg ett litet spel!
        Hjalte hjalte = new Hjalte();

        int [] poang = {
                10, 20, 5, 50, 15
        };
        int total = 0;

        for (int i = 0; i < poang.length; i++) {

            total = total + poang[i];
        }
        hjalte.setPoang(total);

        System.out.println("Hjälte poäng: " + hjalte.getPoang());

        System.out.println("Högsta Poäng: " + hjalte.hogstaPoang(poang));
    }
}
