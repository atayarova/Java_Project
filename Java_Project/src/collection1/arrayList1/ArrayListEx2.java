package collection1.arrayList1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<String> seasons = new ArrayList<>();
        seasons.add("winter");
        seasons.add("spring");
        Scanner scan = new Scanner(System.in);

        seasons.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
