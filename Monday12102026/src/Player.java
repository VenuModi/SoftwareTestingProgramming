/*Övning 5 - Hemlig highscore
* Skapa enm klass player där spelearens poäng är privat och bara nås genom metoder.
* - Skapa private int score.
* - Skapa getScore() som retunerar splarens score.
* - Skapa setScore(int score) som ändrar spelarens score.
* - Använd this.score i settern.
* - Testa från main() att ändra och läsa spelarens score.
*/

public class Player {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
