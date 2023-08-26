package collection1.set;

import java.util.*;

public class Set1 {
    public static void main(String[] args) {
        // variables
        int num = 90;

// object
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world");
        System.out.println(sb);

// arrays
        int [] nums = {100,34,56,78};


// Collection
// List: ArrayList, LinkedList, Vector(Stack)

// ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Kanzada");
        list1.add("Arina");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

// LinkedList
        LinkedList<Boolean> list2 = new LinkedList<>();
        list2.add(true);

        list2.add(false);

// Vector ->
//    ^
//    |
// Stack -> LIFO


// FIFO
// Queue --> PriorityQueue
// Deque --> ArrayDeque

// Set --> interface
// HashSet --> class
// LinkedHasSet --> class
// TreeSet --> class

// unpredictable order
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(34);
        set1.add(54);
        set1.add(100);
        set1.add(21);
        set1.add(89);
        set1.add(0);
        System.out.println(set1);

// predictable order
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(23);
        set2.add(9);
        set2.add(78);
        set2.add(47);
        set2.add(0);
        set2.add(21);
        System.out.println(set2);

// [<- 23,->  <- 9, ->  <- 78, ->  <- 47,->  <-  0, ->  <- 21 ->]

// sorted order
        TreeSet<Integer> set3 = new TreeSet<>();
        set3.add(44);
        set3.add(0);
        set3.add(89);
        set3.add(12);
        set3.add(1000);
        set3.add(67);
        System.out.println(set3);

        // String  / StringBuilder
// mutable / immutable

// Arrays / ArrayList

// List
// ArrayList / LinkedList

// Set
// HashSet / LinkedHashSet / Treeset

//  List       /     Set
//  index      /     no index
//  duplicate  /     no duplicate



    }
}
