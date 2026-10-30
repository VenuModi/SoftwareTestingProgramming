import java.util.InputMismatchException;
import java.util.Scanner;

public class RobotCafe {

    private static final int MIN_ROBOT_SECRET_CODE = 1000;
    private static final int MAX_ROBOT_SECRET_CODE = 9999;

    public static void main(String[] args) {

        String[] menuItems = {
                "Cafe",
                "Chai Latte",
                "Cinnamon Buns",
                "Chocolate Havre Balls",
                "Protein Bar",
                "Juice"
        };

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {

            printMenu(menuItems);

                    int choice = readMenuchoice(scanner);

                    if (choice == 0){

                        System.out.println("Thank you for visiting ROBOT CAFE!");

                        isRunning = false;

                    } else if(choice >= 1 && choice <= menuItems.length) {

                       processOrder(scanner, menuItems[choice - 1]);

                        }else {
                        System.out.println("Invalid menu choice! Try again.");
                    }

                }
            scanner.close();

            }

    public static void printMenu(String[] menuItems){

        System.out.println("======ROBOT CAFE======");

        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " + menuItems[i]);

        }

        System.out.println("0. Exit");
    }

    public static void validateRobotCode(int code){

        if (code < MIN_ROBOT_SECRET_CODE || code > MAX_ROBOT_SECRET_CODE){
            throw new IllegalArgumentException("Invalid Robot code!! The code must contain 4 digits.");
        }

        System.out.println("Robot code accepted!");

    }

    public static int readMenuchoice(Scanner scanner){
        while(true){
            try {
                System.out.print("Chhose your order by selecting a number from (1-6): ");
                return scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Invalid input! Please enter a whole number from (1-6)");
                scanner.nextLine();
            }
        }
    }

    public static void processOrder(Scanner scanner, String menuItem){

        System.out.println("You ordered: " + menuItem);

        System.out.print("Enter your secret Robot Code: ");

        try {
            int robotCode = scanner.nextInt();

            validateRobotCode(robotCode);
        }catch (InputMismatchException e){

            System.out.println("Invalid Input! Please enter a number: ");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
