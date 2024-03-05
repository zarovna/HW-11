package HomeWork_11;

import java.util.Scanner;

public class Identification {
    public static void main(String[] args) {

        String Username0, Username;
        Username0 = "Bee";
        String Password0, Password;
        Password0 = "123456";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ім'я:  ");
        Username = scanner.nextLine();
        System.out.println("Введіть пароль:  ");
        Password = scanner.nextLine();

        if (Username.length() == 0 || Password.length() == 0) {
            System.out.println("Не введено ім'я чи пароль! Ім'я та пароль мають бути обов'язково введені!");
            return;
        }
        if (Password.length() < 6) {
            System.out.println("Введений не вірний пароль! Пароль має містити 6 або більше символів!");
            return;
        }

        if (!Username.equals(Username0) || !Password.equals(Password0)) {
            System.out.println("Введено не вірне ім'я користувача чи пароль!");
            return;
        } else System.out.println("Вхід в систему успішно виконаний!");

        scanner.close();
    }
}
