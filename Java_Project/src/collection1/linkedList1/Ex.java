package collection1.linkedList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Ex {
    public static void main(String[] args) {
//        String str = "Hello world";
//        char[] result = str.toCharArray();
//
//        System.out.println("Char array:");
//        for (int i = 0; i < result.length; i++)
//            System.out.println("Element [" + i + "]: " + result[i]);
//            String str_result = new String(result);
//            System.out.println(result);
//            List<String> list = new ArrayList<>(Arrays.asList(str_result));
//            System.out.println(str_result);

//        String str = "Hello World!";
//        String[] words = str.split(" ");
//        List<List<Character>> result = new ArrayList<>();
//
//        for (String word : words) {
//            List<Character> chars = new ArrayList<>();
//            for (char c : word.toCharArray()) {
//                chars.add(c);
//            }
//            result.add(chars);
//        }
//        System.out.println(result);
        String str = "Hello World!";
        String[] words = str.split(" ");
        char[][] result = new char[words.length][];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char[] chars = new char[word.length()];
            for (int j = 0; j < word.length(); j++) {
                chars[j] = word.charAt(j);
            }
            result[i] = chars;
        }

        System.out.println(Arrays.deepToString(result));


        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");

        sb1.toString();
        char[][] array = new char[sb1.length()][sb2.length()];
        for (int i = 0; i < sb1.length(); i++) {
            array[i] = new char[]{sb1.charAt(i)};
            for (int j = 0; j < sb1.length(); j++) {
                array[j] = new char[]{sb2.charAt(j)};
            }
        }
        System.out.println(Arrays.deepToString(array));


    }




    }


