import java.util.InputMismatchException;
import java.util.Scanner;

public class RobotCafe {

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

            boolean validInput = false;

            while (!validInput) {

                try {
                    System.out.print("Choose your order by selecting the number from (1 - 6)");

                    int choice = scanner.nextInt();

                    if (choice == 0){

                        System.out.println("Thank you for visiting ROBOT CAFE!");

                        isRunning = false;
                        validInput = true;
                    } else if(choice >= 1 && choice <= menuItems.length) {

                        System.out.println("You have selected number - " + choice + " " + menuItems[choice - 1]);

                        System.out.print("Enter your secret Robot Code: ");

                        int robotCode = scanner.nextInt();

                        try{
                            validateRobotCode(robotCode);
                        }catch (IllegalArgumentException e){
                            System.out.println(e.getMessage());
                        }

                        validInput = true;

                    } else {
                        System.out.println("Invalid menu choice! Try again.");
                    }

                } catch (InputMismatchException e) {

                    System.out.println("Invalid input!! Please enter a whole number from (1 - 6).");

                    scanner.nextLine();

                }

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

        if (code < 1000 || code > 9999){
            throw new IllegalArgumentException("Invalid Robot code!! The code must contain 4 digits.");
        }

        System.out.println("Robot code accepted!");

    }
}
