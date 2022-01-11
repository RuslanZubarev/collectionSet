package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static EmailList emailList = new EmailList();
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    public static void main(String[] args) {
        String regex = "ADD\\s+([A-z0-9-_.]+?@[A-z0-9]+?\\.[A-z]{2,3})";
        Pattern pattern = Pattern.compile(regex);
        Scanner scanner = new Scanner(System.in);

        String email = "";
        while (true) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (input.equals("0")) {
                break;
            }

            if (matcher.find()) {
                email = matcher.group(1);
                emailList.add(email);

            }
            if (input.equals("LIST")) {
                emailList.getSortedEmails();
                break;
            }
        }
    }
}

/* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
                - список должен быть отсортирован по алфавиту
                - email в разных регистрах считается одинаковыми
                hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
                hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
                "Неверный формат email"
                */