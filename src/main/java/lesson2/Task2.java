package lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oneNumber = scanner.nextInt();
        int twoNumber = scanner.nextInt();
        if (oneNumber >= twoNumber) {
            System.out.println("Некорректный ввод");
        }
        for (int index = oneNumber + 1; index < twoNumber; index++) {
            if (index % 5 == 0 && index % 10 != 0) {
                System.out.println(index);
            }
        }
        while (oneNumber + 1 < twoNumber) {
            if (oneNumber % 5 == 0 && oneNumber % 10 != 0) {
                System.out.println(oneNumber);
            }
            oneNumber++;
        }
    }
}
