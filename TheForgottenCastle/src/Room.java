import java.util.Scanner;

public class Room {

    private final String name;
    private final String description;
    private final Challenge challenge;
    private final KeyType rewardKey;

    private boolean completed = false;

    public Room(String name, String description, Challenge challenge, KeyType rewardKey) {

        this.name = name;
        this.description = description;
        this.challenge = challenge;
        this.rewardKey = rewardKey;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void enter (Player player, Scanner scanner) {

        if(completed) {
            System.out.println("You have already completed this room");

            return;
        }

        if (!player.isAlive()) {
            return;
        }
        System.out.println(name);
        System.out.println(description);

        if (challenge.play(player, scanner) && player.isAlive()) {

            completed = true;

            if (player.collectKey(rewardKey)) {

                System.out.println("You found the " + rewardKey + " key!! + 100XP");

                player.gainExperience(100);
            }
        }
    }
}
