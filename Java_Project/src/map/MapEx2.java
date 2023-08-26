package map;

import java.util.HashMap;
import java.util.Map;


public class MapEx2 {
    public static void main(String[] args) {
        Map<String, String> country = new HashMap<>();
        country.put("Kyrgyzstan", "Bishkek");
        country.put("UK", "London");
        country.put("Kazakstan", "Astana");
        for (String i : country.keySet()) { // keys
            System.out.println(i);
        }
        for (String i : country.values()) { //values
            System.out.println(i);
        }

        for (Map.Entry<String, String> entry : country.entrySet()) { // key and value
            System.out.println("ID: " + entry.getKey() + ", Страна: " + entry.getValue());

        }

    }
}
