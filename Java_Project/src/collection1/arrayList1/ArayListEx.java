package collection1.arrayList1;

import java.util.ArrayList;

public class ArayListEx {
    public static void main(String[] args) {
        ArrayList <String>  list1 = new ArrayList<>();
        list1.add("Kyrgyzstan");
        list1.add("China");
        list1.add("Kazahstan");
        list1.add("USA");
        list1.removeIf(list -> list.endsWith("stan"));
        System.out.println(list1);
    }
}
