package lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double one = scanner.nextDouble();
            double two = scanner.nextDouble();
            if (two == 0) {
                break;
            }
            System.out.printf("Ваш результат %.2f", one / two);
        }
    }

}

