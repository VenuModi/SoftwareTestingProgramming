/*2. Fredagsmenyn
* - Skapa en variabel choice med ett värde, mellan 1 och 4.
* - Använd switch för att koppla varje val till en maträtt.
* - Lägg till default för ett ogiltigt val.*/

import java.util.Scanner;

public class FridayMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Friday Menu!");
        System.out.println("1. Pizza - Margarita"
        +"\n(Mozzerala cheese, tomato sauce, Basil)\n");
        System.out.println("2. Pizza - Hawai"
        +"\n(Tomato sauce, mozzarella cheese, ham (or bacon), and pineapple)\n");
        System.out.println("3. Pizza - kebab"
        +"\n(Tomato sauce, pizza cheese, sliced kebab meat(beef,lamb or chicken))\n");
        System.out.println("4. Pizza - Vegetarian"
        +"\n(Tomato sauce, Mushrooms, Bell peppers, Onions, Olives, Tomatoes, Pizza cheese)\n");

        System.out.println("To order, please choose a number from the menu: ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("You chose: Pizza - Margarita");
                break;
            case 2:
                System.out.println("You chose: Pizza - Hawai");
                break;
            case 3:
                System.out.println("You chose: Pizza - Kebab");
                break;
            case 4:
                System.out.println("You chose: Pizza - Vegetarian");
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}
