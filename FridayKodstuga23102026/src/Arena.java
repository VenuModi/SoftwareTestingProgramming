import java.util.*;

public class Arena {

    /*Declaring private so only the arena class can directly access the fields
    * final - so the monsters variable cannot be reassigned to another list & it prevents from replacing the
    * list reference
    */
    private final List<Monster> monsters = new ArrayList<>();//Store monsters in one list


    /*Key = Monster's name & Value = Monster's points.
    *Integer coz Map require reference type & cannot take primitive data type */
    private final Map<String, Integer> scores = new HashMap<>();

    private final Set<String> monsterTypes = new HashSet<>();//To store unique monster types & no duplicates

    /*Create random object to decide whether a monster performs a special attack or
    * does it get an extra turn.*/
    private final Random random = new Random();

    //Arena constructor
    public Arena() {
        monsters.add(new Dragon());
        monsters.add(new Robot());
        monsters.add(new Slime());
        monsters.add(new Ghost());

        for (Monster monster : monsters) {
            scores.put(monster.getName(), 0);//put() to update  or add a key-value pair in the map. start with 0 pts
            monsterTypes.add(monster.getName());

            /*Now the arena has a list of four monsters, a map of scores initialized to 0 & set of 4 unique
            monster names
            */
        }
    }

    public void showMonsters(){
        System.out.println("\n=== ALL MONSTERS ===");

        for (int i = 0; i < monsters.size(); i++) {
            Monster monster = monsters.get(i);//get monster stored at position i.

            System.out.println((i +1) + ". " + monster.getName() + " - " + monster.getHp() + " HP");
            //(i+1) -> to start menu choices from 1 & not 0.

        }
    }

    public void showMonsterTypes(){
        System.out.println("\n=== ALL MONSTER TYPES ===");

        for (String type : monsterTypes){
            System.out.println(type);
        }
    }

    /*Streams & Lambda
    * .stream() to process a sequence of elements to sort & print the scoreboard entries
    * a & b represent two entries being compared. b is first to get descending order - the largest number
    * of points first. .forEach()-> to process every entry in the sorted stream
    */
    public void showLeaderBoard(){
        System.out.println("\n=== LEADERBOARD ===");

        scores.entrySet().stream().sorted((a, b) ->
                        Integer.compare(b.getValue(), a.getValue()))
                        .forEach(entry -> System.out.println(
                                entry.getKey() + ": " + entry.getValue() + " points"));
    }

    /*Main battle method
    * Check players choice (1-4)
    * If player chooses 8, condition returns true -Invalid message */
    public void startMatch(int choice){

        if (choice < 1 || choice > monsters.size()){
            System.out.println("Invalid Monster choice!!");
            return;
        }

        Monster player = monsters.get(choice - 1); //To get menu nos starting from1 and not 0

        /*Ensuring that the player never fights against themselves. Create a copy of monster list,
        remove the player's chosen monster & shuffle the remaining monsters.
         */
        List<Monster> opponents = new ArrayList<>(monsters);

        opponents.remove(player);//To remove selected player from possible list of opponents. Eg -> select robot,
        //the opponent list contains dragon, slime & ghost

        Collections.shuffle(opponents);

        Monster opponent = opponents.get(0); //Select monster at the first position after shuffling

        //Reset the HP to start the match at 100HP
        player.resetHp();
        opponent.resetHp();


        System.out.println("\n=== BATTLE START ===");
        System.out.println(player.getName() + " VS " + opponent.getName());

        /*Deque - allow & remove element from both ends

       */
        Deque<Monster> turns = new ArrayDeque<>();//Queue can also hold an ArrayDeque, but Deque is spicy part

        //Player - Dragon; Opponent - Robot
        turns.addLast(player);
        turns.addLast(opponent);

        //Both monsters must be alive to continue the battle
        while (player.isAlive() && opponent.isAlive()){

            Monster attacker = turns.removeFirst();// remove & return 1st monster object in deque

            /*If the attacker is the player, the defender is the opponent.
            * Otherwise, the defender is the player.
            */

//            Monster defender;
//            if (attacker == player){
//                defender = opponent;
//            }else {
//                defender = player;
//            }

            Monster defender = attacker == player ? opponent:player;//Used - Terenary operator -> condition ? valueIfTrue : valueIfFalse

            //Calculate damage
            int damage;

            /*Random chance for special attack
            * Monster should support special attacks & the random value must be 0*/
            if (attacker instanceof SpecialAttack && random.nextInt(4) == 0){

                SpecialAttack specialattack = (SpecialAttack) attacker;

                damage = specialattack.useSpecialAttack();

            }else {
                damage = attacker.attack();
            }

            defender.takeDamage(damage);

            System.out.println(defender.getName() + " has " + defender.getHp() + " HP remaining.\n");

            //Battle end
            if (!defender.isAlive()){
                break;
            }

            /*Spicy: chance to jump ahead in the queue
            * Give monster an extra run*/
            if (random.nextInt(5) == 0){
                System.out.println(attacker.getName() + " gets an extra turn!");

                turns.addFirst(attacker);//Dragon jumps ahead & attacks again
            }else {
                turns.addLast(attacker);//Put Dragon at the back of the queue, making Robot next attacker
            }
        }

        //If player is still alive, the player wins, otherwise the opponent wins.
//        Monster winner;
//        if (player.isAlive()){
//            winner = player;
//        }else {
//            winner = opponent;
//        }
        Monster winner = player.isAlive() ? player : opponent;

        System.out.println("=== Game over ===");
        System.out.println(winner.getName() + " WINS!");

        scores.put(winner.getName(), scores.get(winner.getName()) + 3);

        System.out.println(winner.getName() + " earns 3 points!!");



    }
}
