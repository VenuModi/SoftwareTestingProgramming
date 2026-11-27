import java.util.Scanner;

public class PuzzleChallenge implements Challenge{

    private final String question;
    private final String answer;

    public PuzzleChallenge(String question, String answer) {

        this.question = question;
        this.answer = answer;
    }

    @Override
    public boolean play(Player player, Scanner scanner) {

        while (player.isAlive()){

            System.out.println(question);

            System.out.println("Your answer (0 to return): ");

            String input = scanner.nextLine().trim();

            if (input.equals("0")) {
                return false;
            }

            if (input.isEmpty()) {
                System.out.println("Please enter an answer.");
                continue;
            }

            if (input.equalsIgnoreCase(answer)) {

                System.out.println("Correct answer!");

                return true;
            }

            System.out.println("Wrong answer! you lose 20 HP");

            player.takeDamage(20);
        }
        return false;
    }
}
