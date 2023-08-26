package collection1.arrayList1;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class ArraylistExer {
    public static void main(String[] args) {
//        ArrayList<String> week = new ArrayList<>();
//        week.add("Monday"); //0
//        week.add("Saturday");
//        week.add("Tuesday");
//        week.add("Friday");
//        week.add("Thursday");
//        week.add("Wednesday");
//        week.add("Sunday");
//        System.out.println("Before Sorting: "+ week);
//// Sorting ArrayList in ascending Order
//        //Collections.sort(week);
//// printing the sorted ArrayList
//        week.sort(Comparator.comparing(day-> DayOfWeek.valueOf(day.toString().toUpperCase(Locale.ROOT))));
//
//        ArrayList <String> days = new ArrayList<>();
//        days.add("Saturday");
//        days.add("Tuesday");
//        days.add("Monday");
//        days.add("Sunday");
//        days.add("Friday");
//        days.add("Thursday");
//        days.add("Wednesday");

        ArrayList <String> days = new ArrayList<>();
        days.add("Saturday");
        days.add("Tuesday");
        days.add("Monday");
        days.add("Sunday");
        days.add("Friday");
        days.add("Thursday");
        days.add("Wednesday");

        ArrayList<String> ordered = new ArrayList<>(days.size());

        String[] order = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (String day : order) {
            for (String d : days) {
                if (d.equals(day)) {
                    ordered.add(d);
                }
            }
        }

        System.out.println(ordered);
    }


    }

