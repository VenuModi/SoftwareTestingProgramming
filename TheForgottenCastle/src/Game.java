import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private final Scanner scanner = new Scanner(System.in);

    private final ArrayList<Room>rooms = new ArrayList<>();

    private final ExitDoor exitDoor = new ExitDoor();

    private Player player;

    private void createCharacter() {

        String name;

        do {
            System.out.println("Enter your character's name: ");

            name = scanner.nextLine().trim();

            if (name.isEmpty()) {

                System.out.println("Name cannot be blank");
            }
        } while (name.isEmpty());

            player = new Player(name);

        System.out.println("Welcome, " + name + "!");

    }

    private void createRooms() {

        rooms.add(new Room(
                "The Ancient Library",
                "A message is carved into a book.",
                new PuzzleChallenge(
                        "What has many keys but cannot open a lock?",
                        "Piano"),
                KeyType.BRONZE
        ));

        rooms.add(new Room(
                "The Experiment Chamber",
                "A machine displays a sequence.",
                new PuzzleChallenge(
                        "Find the next number: 3, 6, 12, 24, ?",
                        "48"),
                KeyType.SILVER
        ));

        rooms.add(new Room(
                "The Dungeon",
                "A Goblin guards the key.",
                new GoblinChallenge(),
                KeyType.EMERALD
        ));

        rooms.add(new Room(
                "The Treasure Vault",
                "A chest needs a three-digit code.",
                new PuzzleChallenge(
                        "First digit: 2+5. Second digit: 3*1. Third digit: 18-9",
                        "739"),
                KeyType.GOLDEN
        ));
    }

    private void showMainMenu() {

        System.out.println("\n====== THE CASTLE HALL ======");

        player.showStatistics();

        System.out.println("1. Explore a room");
        System.out.println("2. View character statistics");
        System.out.println("3. View game instructions");
        System.out.println("4. Approach exit door");
        System.out.println("0. Quit game");

        System.out.print("Enter your choice: ");

    }

}
