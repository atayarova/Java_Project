import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Создайте логин:  ");
        String Login = scanner.next();
        System.out.println("Подтвердите логин:  ");
        String Login2 = scanner.next();
        if (Login.equals(Login2)) {
            System.out.println("Придумайте пароль:  ");
            String Password = scanner.next();
            System.out.println("Подтвердите пароль:  ");
            String Password2 = scanner.next();
            if (Password2.equals(Password)) {
                System.out.println("Аккаунт успешно создан");
                System.out.println("Войдите в аккаунт\n  Введите логин:  ");
                String Login3 = scanner.next();
                if (Login3.equals(Login)) {
                    System.out.println("Введите пароль:  ");
                    String Password3 = scanner.next();
                    if (Password3.equals(Password)) {
                        System.out.println("Вы вошли в аккаунт!");
                    } else {
                        System.err.println("Не верный пароль");
                    }
                } else {
                    System.err.println("Не верный логин");
                }
            } else {
                System.err.println("Ошибка, пароль не совподает");
            }
        } else {
            System.err.println("Ошибка, логин не совподает");
        }

    }
}
