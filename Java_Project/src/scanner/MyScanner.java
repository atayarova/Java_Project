package scanner;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("What is your name?");
//        String name = scan.nextLine();
//        System.out.println("Name: " + name);

//        System.out.println("How old are you?");
//        int age = scan.nextInt();
//        System.out.println("Age: " + age);

//        byte num = scan.nextByte();
//        System.out.println(num);
//
//        short num1 = scan.nextShort();
//        System.out.println(num1);

//        long num2 = scan.nextLong();
//        System.out.println(num2);

//        float num3 = scan.nextFloat();
//        System.out.println(num3);

//        double num4 = scan.nextDouble();
//        System.out.println(num4);

//        boolean b1 = scan.nextBoolean();
//        System.out.println(b1);


        // .next()     --> first word
        // .nextLine() --> all line

//        String gender = scan.next();
//        System.out.println(gender);


        System.out.println("How old are you?");
        int age = scan.nextInt();

        if (age >= 16){
            System.out.println("Can get ID passport");
        } else {
            System.out.println("Can not get a passport");
        }



    }
}


// without "new" = variable
// with "new"    = object
