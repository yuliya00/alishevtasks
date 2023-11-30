package lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark = 0;
        while (mark < 5) {
            double one = scanner.nextDouble();
            double two = scanner.nextDouble();
            mark++;
            if (two == 0) {
                System.out.println("Деление на ноль");
                continue;
            }
            System.out.printf("Ваш результат %.2f", one / two);
        }

    }
}
