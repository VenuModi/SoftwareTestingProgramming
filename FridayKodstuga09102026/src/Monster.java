/*5. Monster Arena
* - Skapa klassen Monster med namn och health.
* - Skapa en konstrtuktor som bestämmer monsterets namn och start-health.
* - Skapa ett monster i main.
* - Använd en loop för att simulera attacker där monstret förlorar health varje runda.
* - Avsluta loopen med break när monstrets health är 0 eller mindre*/

public class Monster {
    String name;
    int health;

    public Monster (String name, int health){
        this.name= name;
        this.health = health;
    }
    public void takeDamage(int damage){
        health = health - damage;

        System.out.println(name + " has " + health + " health left.");

    }
}
