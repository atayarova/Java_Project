package home_work;

import java.util.Scanner;

public class HomeWork2_IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number == 1) {
            System.out.println("Первый квартал");
        } else if (number == 2) {
            System.out.println("Второй квартал");

        } else if (number == 3) {
            System.out.println("Третий квартал");

        } else if (number == 4) {
            System.out.println("Четвёртый квартал");

        } else {
            System.out.println("В году есть 4 квартала");
        }
    }
}

