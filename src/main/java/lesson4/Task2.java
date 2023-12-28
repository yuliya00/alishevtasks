package lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(10000);
        }
        int a = 0;
        for (int num : array) {
            if (a < num) {
                a = num;
            }
        }
        System.out.println("Наибольший элемент массива: " + a);
        int b = 10000;
        for (int num : array) {
            if (num < b) {
                b = num;
            }
        }
        System.out.println("Наименьший элемент массива: " + b);
        int c = 0;
        for (int num : array) {
            if (num % 10 == 0) {
                c++;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + c);
        int sum = 0;
        for (int num : array) {
            if (num % 10 == 0) {
                sum += num;
            }
        }
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
