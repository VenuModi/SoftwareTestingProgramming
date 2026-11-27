import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class ExitDoor {

    private final Map<KeyType, Boolean> locks = new HashMap<>();

    public ExitDoor() {

        for (KeyType keyType : KeyType.values()){

            locks.put(keyType, false);
        }
    }

    public boolean approach(Player player) {

        System.out.println("THE CASTLE EXIT");

        int opened = 0;

        for (KeyType keyType : KeyType.values()) {

            if (!player.hasKey(keyType)) {

                locks.put(keyType, true);
            }

            if (locks.get(keyType)) {

                opened++;
            }

            System.out.println(keyType + " lock: "
            + (locks.get(keyType) ? "UNLOCKED" : "LOCKED"));
        }

        System.out.println("Locks opened: " + opened + "/"
        + KeyType.values().length);

        return opened == KeyType.values().length;
    }
}
