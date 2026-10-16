/*Övning 3 - Ditt drömlag
* Skapa en String-array med fem spelaren.
* - Skriv ut den första och sista spelaren.
* - Byt ut en av spelarna mot ett annat namn.
* - Skriv ut alla spelare med en vanlig for-loop.
* - Skriv ut hur många spelare laget har med length.
* Extra utmaning: Skriv ut alla spelare med en Enhanced for-loop.
*/

public class DreamTeam {

    public void showTeam(){

        String[] players = {
                "Venu", "Ramta", "Ouras", "Rekha", "Kamar"
        };

        System.out.println("First Player: " + players[0]
                            +"\nLast Player: " + players[players.length -1]);

        //Replace a player
        players[0] = "Elin";

        //Print all the players
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }

        //Print total players
        System.out.println("Total players in the team are: " + players.length);

        //Print all the players
        for (String player : players){
            System.out.println(player);
        }

    }
}
