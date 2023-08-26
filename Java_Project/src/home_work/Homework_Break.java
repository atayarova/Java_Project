package home_work;

import java.util.Scanner;

public class Homework_Break {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Создайте логин:");
        String login = scan.nextLine();
        System.out.println("Создайте пароль:");
        String password = scan.nextLine();
        System.out.println("Спасибо. Пожалуйста автризуйтесь");
        for (int i = 0; i < 3; i++) {
            System.out.println("------------------\n Введите Ваш логин:");
            String user_login = scan.nextLine();
            System.out.println("------------------\n Введите Ваш пароль:");
            String user_password = scan.nextLine();
            if (login.equals(user_login) && password.equals(user_password)) {
                System.out.println("Вы авторизованы.");
                break;
            } else if (i < 2) {
                System.out.println("Попробуйте еще раз ввести логин и пароль!");
            } else {
                System.out.println("Учетная запись заблокирована. Попробуйте через 24 часа");
            }
        }
    }
}
