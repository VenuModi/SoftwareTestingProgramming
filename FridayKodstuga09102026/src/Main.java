import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //4. Bygg ett eget djur
//        System.out.println("Enter the name of your pet: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Enter the age of your pet: ");
//        int age = scanner.nextInt();
//
//        scanner.nextLine();
//
//        System.out.println("Enter the sound that your pet makes: ");
//        String sound = scanner.nextLine();
//
//        scanner.close();
//
//
//        Djur djur1 = new Djur(name, age, sound);
//
//        djur1.gorLjud();


        //5. Monster Arena
//        System.out.println("Enter the name of your monster entering the Arena: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Enter your monsters health: ");
//        int health = scanner.nextInt();
//
//        System.out.println("Enter the damage caused by attack: ");
//        int damage = scanner.nextInt();
//
//        Monster monster = new Monster(name, health);
//        if (health <=0 || damage <=0){
//            System.out.println("Invalid input!! Please enter values greater than 0.");
//        }else {
//            while (true){
//                monster.takeDamage(damage);
//                if (monster.health <=0){
//                    System.out.println("Monster defeated!");
//                    break;
//                }
//            }
//        }
//        scanner.close();

        //6. Bonus - Tamagotchi
        System.out.println("Enter the name of your pet: ");
        String name = scanner.nextLine();

        Pet pet = new Pet(name);

        int choice;

        do {
            System.out.println("\n1. Feed Pet");
            System.out.println("2. Play with pet");
            System.out.println("3. Show status");
            System.out.println("4. Exit");

            System.out.println("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    pet.eat();
                break;
                case 2:
                    pet.play();
                    break;
                case 3:
                    pet.showStatus();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        scanner.close();
   }
}
