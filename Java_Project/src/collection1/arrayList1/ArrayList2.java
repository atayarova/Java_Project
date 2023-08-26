package collection1.arrayList1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Character> symbols=new ArrayList<>();
        symbols.add('%');
        symbols.add('H');
        symbols.add('?');
        symbols.add('n');
        symbols.add('*');
      // symbols.remove(1);
        System.out.println(symbols);

        Iterator<Character> itr = symbols.iterator();
        while(itr.hasNext()){

            System.out.println(itr.next());
        }


    }
}
