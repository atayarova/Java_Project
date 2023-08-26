package collection1.linkedList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Blue");

        LinkedList<String> colors2 = new LinkedList<>();
        colors2.add("Brown");
        colors2.add("Orange");
        colors2.add("Red");
        colors2.add("White");
        colors2.addAll(2,colors);
        System.out.println(colors2);

        List<String> colors3 = new ArrayList<>();
        colors3.add("Purple");

        List<String> colors4 = new LinkedList<>();
        colors4.add("silver");

        String str = new String("Salam");
        StringBuilder sb1 = new StringBuilder(str);

        Integer codes [] = {555, 227, 777, 700, 559};
        System.out.println("Arrays:\n" + Arrays.toString(codes));
        System.out.println(codes[3]);

        ArrayList<Integer> listOfCodes = new ArrayList<>(Arrays.asList(codes));
        System.out.println("ArrayList:\n" + listOfCodes);
        System.out.println(listOfCodes.get(4));
    }
}
