package string_methods;

public class StringMethods1 {
    public static void main(String[] args) {
        String name1 = "James";
        String name2 = new String("John");

        //              01234  -> index
        String color = "white";
        //              12345  -> length()

        // window
        // apple

        //               01234
        String flower = "tulip";
        //               12345
        // length()
        System.out.println(flower.length()); // 5
        // charAt()
        System.out.println(flower.charAt(2)); // l
        System.out.println(flower.charAt(0)); // t
        System.out.println(flower.charAt(3)); // i
        // concat()
        String laptop1 = "Mac";
        String laptop2 = "Book";
        String result = laptop1 + laptop2;
        System.out.println(result);

        System.out.println("Hello " + "James");
        System.out.println(56 + 78);

        System.out.println(2 + 8 + " Yellow"); // 10 + " Yellow" --> 10 Yellow
        System.out.println("Yellow " + 2 + 8); // "Yellow 2" + 8 --> Yellow28

        //                             ( "6Hi" + 7 )
        System.out.println("Yellow " + (6 + "Hi" + 7) + 8); // "Yellow 13" + 8 --> Yellow 138

        String result2 = laptop1.concat(laptop2);
        System.out.println(result2);

        System.out.println(laptop1.concat("67"));

        // substring()
        //              0123456789
        String actor = "Bred Pitt";
        System.out.println(actor);
        //              123456789
        System.out.println(actor.substring(5));
        System.out.println(actor.substring(3,6));
        System.out.println(actor.substring(5, 9));
        //                  0123456789
        System.out.println("Will Smith".substring(4, 6));

//        3456
//        d Pi
        // trim()
        String country = "    Kyrgy  zstan    ";
        System.out.println(country);
        System.out.println(country.trim());

        // indexOf()
        //             012345678901234
        String book = "Cosmos smos mos";
        System.out.println(book.indexOf('s')); // 2
        System.out.println(book.indexOf('s', 4));
        System.out.println(book.indexOf("mos")); // 3
        System.out.println(book.indexOf("mos", 6));
        System.out.println(book.indexOf("mos", 9));

        System.out.println(book.indexOf("os", 5));

        // lastIndexOf()
        //             012345
        String city = "Loonoopsdon";
        System.out.println(city.lastIndexOf('o')); // 4
        System.out.println(city.lastIndexOf('o', 2)); // 2
//                              10
        //            01234567890
        String str = "Kyrgyzstany";
        //            12345678901

        System.out.println(str.lastIndexOf('y'));
        System.out.println(str.lastIndexOf('y', 6)); // 4

        // .equals()
        String str1 = "Hello";
        String str2 = "hello";
        boolean result3 = str1.equals(str2);
        System.out.println(result3);

        // .equalsIgnoreCase()
        boolean result4 = str1.equalsIgnoreCase(str2);
        System.out.println(result4);

        String country2 = "  Kyrgyzstan   ";
        boolean result5 = country2.trim().toUpperCase().isEmpty();
//                                               0123456789
//               "  Kyrgyzstan   "."Kyrgyzstan"."KYRGYZSTAN".false
        System.out.println(result5);
    }

}
