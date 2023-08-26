package map;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {

        // Unpredictable order
        HashMap<String, Integer> mobOperators = new HashMap<>();
        mobOperators.put("MegaCom", 555);
        mobOperators.put("Belline", 777);
        mobOperators.put("O!", 777);
        mobOperators.put("MegaCom", 559);
        System.out.println(mobOperators);


//              012345
        String color = "Yellow";

// Predictable order
        Map<Boolean, String> status = new LinkedHashMap<>();
        status.put(false, "NO");
        status.put(true, "YES");
        System.out.println(status);

        TreeMap<Integer, String> tashers = new TreeMap<>();
        tashers.put(2, "Aibike");
        tashers.put(1,"Eliza");
        tashers.put(3, "Elmira");
        System.out.println(tashers);

// Map -> no collection
// <key, value> --> any data types
// Key instead of Index
// the key should be unique
// the value can duplicate

        System.out.println(tashers.get(3));
        tashers.remove(1);

        System.out.println(tashers.keySet());
        System.out.println(tashers.values());



// 01, 02 , 03 , 04, 05, 06, 07, 08, 09, 10
    }
}
