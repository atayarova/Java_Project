package collection1.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetEx {
    public static void main(String[] args) {
        HashSet<String> country = new HashSet<>();
        country.add("Seoul");
        country.add("Chicago");
        country.add("San-Francisco");
        country.add("Bishkek");
        country.add("Moscow");
        country.add("Karakol");
        System.out.println(country);
        String name = "Bishkek";
        for (String i : country) {
            if (i.equals(name)){
                System.out.println(i);
            }
        }

        int [] ars = new int [5];
        ars [0] = 352;
        ars [1] = 26;
        ars [2] = 73;
        ars [3] = 101;
        ars [4] = 93;
        LinkedHashSet<Integer> set5 = new LinkedHashSet<>();
        for (int i : ars){
            if(i%2==0){
                set5.add(i);
            }
        }
        System.out.println(set5);


    }
}
