package lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String city = scanner.nextLine();
            if ("Stop".equals(city)) {
                break;
            }
            switch (city) {
                case "Москва", "Ростов", "Владивосток" -> System.out.println("Россия");
                case "Рим", "Турин", "Милан" -> System.out.println("Италия");
                case "Ливерпуль", "Лондон", "Манчестер" -> System.out.println("Англия");
                case "Берлин", "Кёльн", "Мюнхен" -> System.out.println("Германия");
                default -> System.out.println("Неизвестная страна");
            }
        }
    }
}
