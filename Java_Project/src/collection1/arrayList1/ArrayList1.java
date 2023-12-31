package collection1.arrayList1;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        numbers[0] = 89;
        numbers[1] = 34;
        // non generic
        ArrayList list1 = new ArrayList();
        list1.add(387);
        list1.add(23.89);
        list1.add(true);
        list1.add("Hello");
        System.out.println(list1);

        // generic
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(87);
        list2.add(19);
        System.out.println(list2);
        list2.add(1, 88);
        System.out.println(list2);
        // get
        System.out.println(list2.get(2));

        //.size
        System.out.println(list2.size());

        //.clear
//        list2.clear();
//        System.out.println(list2);
        // .remove
        list2.remove(3);
        System.out.println(list2);

        // .contains
        System.out.println(list2.contains(88));

        // .set
        list2.set(0, 54);
        System.out.println(list2);

        // .isEmpty
        System.out.println(list2.isEmpty());
        list2.add(54);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(965);
        list3.add(472);
        list3.add(54);
        System.out.println(list3);
        list3.addAll(1, list2);
        System.out.println(list3);

        list3.removeAll(list2);

        System.out.println(list3);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(45);
        nums.add(100);
        nums.add(75);
        nums.add(100);
        nums.add(28);
        nums.add(14);
        nums.add(54);
        System.out.println(nums);
        nums.remove(3);
        System.out.println(nums);
        nums.addAll(list3);
        System.out.println(nums);
        nums.removeAll(list3);
        System.out.println(nums);
        nums.addAll(list2);
        System.out.println(nums);
        nums.removeAll(list2);
        System.out.println(nums);

//        for (int i = 0; i < nums.size(); i++){
//            System.out.println(nums.get(i));
//        }

        for (Integer i : nums) {
            System.out.println(i);
        }
    }
}
