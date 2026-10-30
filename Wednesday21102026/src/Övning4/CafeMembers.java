package Övning4;

/*4. Välj en bättre datastruktur
* Cafeet vill också ha en lista med unika medlemsnamn. En medlem ska bara registreras en gång även om
* personalen försöker lägga till namnet flera gånger. Skapa en separat samling som löser detta och demonstrera
* att den fungerar.
* Förklara kort varför ni valde den samlingen i stället för Queue. Fundera också på vad som skiljer den från List.
*/

import java.util.HashSet;
import java.util.Set;

public class CafeMembers {

    public static void main(String[] args) {

        Set<String> members = new HashSet<>();

        members.add("Kim");
        members.add("Alex");
        members.add("Lara");
        members.add("Kim");
        members.add("Alex");
        members.add("Annika");

        System.out.println(members);
        System.out.println("Total members: " + members.size());
    }
}
