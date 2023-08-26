package home_work;

import java.util.Scanner;

public class HomeWork2Switch {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        switch (number) {
            case 1:
                System.out.println("Первый квартал");
                break;
            case 2:
                System.out.println("Второй квартал");
                break;
            case 3:
                System.out.println("Третий квартал");
                break;
            case 4:
                System.out.println("Четвёртый квартал");
                break;
            default:
                System.out.println("В году есть 4 квартала");
        }
    }
}
