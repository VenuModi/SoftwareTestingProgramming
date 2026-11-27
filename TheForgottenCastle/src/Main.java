public class Main {

    public static void main(String[] args) {

        Player player = new Player("Hohn Doe");

        player.showStatistics();
        player.takeDamage(20);
        player.collectKey(KeyType.BRONZE);
        player.gainExperience(100);
        player.showStatistics();
    }
}
